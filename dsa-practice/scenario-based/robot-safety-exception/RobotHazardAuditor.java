package robotsafetyexception;

public class RobotHazardAuditor {
 public static void main(String [] args) {
	 
	 RobotHazardAuditor obj =new RobotHazardAuditor();
	 
	 try {
         double riskScore = obj.CalculateHazardRisk(0.14, 10, "Faulty");

         System.out.println("Hazard Risk Score: "+ riskScore);
     } catch (RobotSafetyException e) {
         System.out.println(e.getMessage());
     }
 }
 
	 
     public double CalculateHazardRisk(double armPrecision,  int workerDensity, String machineryState) throws RobotSafetyException {

         if (armPrecision < 0.0 || armPrecision > 1.0) {
             throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
         }

         if (workerDensity <1 || workerDensity >20) {
             throw new RobotSafetyException("Error: Worker density must be 1-20");
         }

         double machineRiskFactor;

         if (machineryState.equals("Worn")) {
             machineRiskFactor = 1.3;
         } 
         else if (machineryState.equals("Faulty")) {
             machineRiskFactor = 2.0;
         } 
         else if (machineryState.equals("Critical")) {
             machineRiskFactor = 3.0;
         } 
         else {
             throw new RobotSafetyException("Error: Unsupported machinery state");
         }

         double hazardRisk = ((1.0 - armPrecision) * 15.0) +  (workerDensity * machineRiskFactor);

         return hazardRisk;
     }
 }


