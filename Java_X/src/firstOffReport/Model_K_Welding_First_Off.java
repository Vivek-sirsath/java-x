package firstOffReport;

public class Model_K_Welding_First_Off {

	public static void main(String[] args) {

		String cleaniningOfRimWeb = "clean";
		String thinerBathCleaningFrequency = "clean";
		int actualWeldingStrength = 5450;
		int LCL = 4994;
		String nuggetFormation = "formed";
		int weldSpot = 8;
		String webCentrality = "ok";
		double webflatness = 0.16;
		double squareness = 0.18;
		double gapBetweenRimWeb = 0.20;
		String rimWebShiftRadially = "not Shift";
		String pokaYoke = "Working";
		String visualCheck = "visually ok";

		if (cleaniningOfRimWeb.equalsIgnoreCase("Clean")) {
			System.out.println("Rim and Web cleaning - OK");
		} else {
			System.out.println("Rim and Web cleaning - NOT_OK");
		}
		if (thinerBathCleaningFrequency.equalsIgnoreCase("Clean")) {
			System.out.println("Thiner bath cleaned at start of shift - OK");
		} else {
			System.out.println("Thiner bath not cleaned - NOT_OK");
		}
		if (actualWeldingStrength > LCL) {
			System.out.println("Welding Strength - OK");
		} else {
			System.out.println("Welding Strength - NOT_OK");
		}
		if (nuggetFormation.equalsIgnoreCase("Formed")) {
			System.out.println("Nugget formed at first and last spot - OK");
		} else {
			System.out.println("Nugget not formed at first and last spot - NOT_OK");
		}
		if (weldSpot == 8) {
			System.out.println("8 welding spots are visually - OK");
		} else {
			System.out.println("Weld spot missing - NOT_OK");
		}
		if (webCentrality.equalsIgnoreCase("Ok")) {
			System.out.println("Web centrality from both sides - OK");
		} else {
			System.out.println("Web centrality - NOT_OK");
		}
		if (webflatness > 0 && webflatness <= 0.30) {
			System.out.println("Web flatness - OK");
		} else {
			System.out.println("Web flatness - NOT_Ok");
		}
		if (squareness > 0 && squareness <= 0.20) {
			System.out.println("Squareness - OK");
		} else {
			System.out.println("Squareness - NOT_OK");
		}
		if (gapBetweenRimWeb >= 0 && gapBetweenRimWeb <= 0.20) {
			System.out.println("Gap between rim and web - OK");
		} else {
			System.out.println("Gap between rim and web - NOT_OK");
		}
		if (rimWebShiftRadially.equalsIgnoreCase("Not Shift")) {
			System.out.println("Rim-Web radially shift - OK");
		} else {
			System.out.println("Rim-Web radially shift - NOT_OK");
		}
		if (pokaYoke.equalsIgnoreCase("working")) {
			System.out.println(
					"Compressor low air pressure indication lamp turns on when air pressure drops. So, Poka Yoke is - OK");
		} else {
			System.out.println("Poka-Yoke is - NOT_OK");
		}
		if (visualCheck.equalsIgnoreCase("Visually OK")) {
			System.out.println(" ");
			System.out.println("(Visual check for weld crack, exessive burning, spot missing, spatter, "
					+ "burr on resting plate and proximity sensor. " + "Ensure proximity sensor working properly."
					+ "Ensure no carbon on electrode face, if carbon on electrode face observed, stop the macine & regrind electrode."
					+ "Ensure pressure pad pressure is ok. Pressure pad working properly and spring condition is OK."
					+ "pressure pad bolt not loose. Difference between 3 resting button within 0.4 mm)");
		} else {
			System.out.println("Visual check is - NOT_OK");
		}
		System.out.println(" ");
		if ((cleaniningOfRimWeb.equalsIgnoreCase("Clean")) 
				&& (thinerBathCleaningFrequency.equalsIgnoreCase("Clean")) 
				&& (actualWeldingStrength > LCL)
				&& (nuggetFormation.equalsIgnoreCase("Formed")) && (weldSpot == 8) 
				&& (webCentrality.equalsIgnoreCase("Ok"))
				&& (webflatness > 0 && webflatness <= 0.30) 
				&& (squareness > 0 && squareness <= 0.20)
				&& (gapBetweenRimWeb >= 0 && gapBetweenRimWeb <= 0.20) 
				&& (rimWebShiftRadially.equalsIgnoreCase("Not Shift"))
				&& (pokaYoke.equalsIgnoreCase("working")) 
				&& (visualCheck.equalsIgnoreCase("Visually OK"))) {

			System.out.println("***First OFF Accepted***");
		} else {
			System.out.println("***First OFF Rejected***");
		}

	}

}
