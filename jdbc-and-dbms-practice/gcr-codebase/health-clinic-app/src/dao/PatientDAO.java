package dao;

import util.DBConnection;
import model.Patient;

import java.sql.*;

public class PatientDAO {

    public void addPatient(Patient patient) {

        String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, patient.getName());
            ps.setDate(2, Date.valueOf(patient.getDob()));
            ps.setString(3, patient.getPhone());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setString(6, patient.getBloodGroup());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Generated Patient ID: " + rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
