package firstOffReport;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Model_K_CP_First_OFF {

	public static void main(String[] args) {

		double maxTopRadius = 95.48;
		double minTopRadius = 95.04;
		double topRadiusVariationExpected = 0.30;
		double topRadiusVariationActual = maxTopRadius - minTopRadius;
		double maxBottomRadius = 95.50;
		double minBottomRadius = 95.26;
		double bottomRadiusVariationExpected = 0.30;
		double bottomRadiusVariationActual = maxBottomRadius - minBottomRadius;
		double squareness = 0.18;
		double piercingHoleDiameter = 6.11;
		double slotWidth = 7.36;
		double webFlatness = 0.22;
		double concavity = 0.06;
		String pokaYoke = "Working";
		String hblGauge = "free";
		String deburring = "Proper";
		String visualCheck = "Visually OK"; 

		if ((maxTopRadius - minTopRadius <= topRadiusVariationExpected)
				&& (topRadiusVariationExpected > 0 && topRadiusVariationExpected <= 0.30)
				&& (maxTopRadius <= 95.50 && minTopRadius >= 95.20)) {
			System.out.println("Top Radius is OK");
		} else {
			System.out.println("Top Radius is NOT_OK");
		}

		System.out.printf("Top Radius Variation:- " + "%.2f", topRadiusVariationActual);
		System.out.println(" ");

		if ((maxBottomRadius - minBottomRadius <= bottomRadiusVariationExpected)
				&& (bottomRadiusVariationExpected > 0 && bottomRadiusVariationExpected <= 0.30)
				&& (maxBottomRadius <= 95.50 && minBottomRadius >= 95.20)) {
			System.out.println("Bottom Radius is OK");
		} else {
			System.out.println("Bottom Radius is NOT_OK");
		}

		System.out.printf("Bottom Radius Variation:- " + "%.2f", bottomRadiusVariationActual);
		System.out.println(" ");

		if (squareness > 0 && squareness <= 0.20) {
			System.out.println("Squareness is OK");
		} else {
			System.out.println("Squareness is NOT_OK");
		}
		if (piercingHoleDiameter >= 6.08 && piercingHoleDiameter <= 6.38) {
			System.out.println("Piercing Hole is OK");
		} else {
			System.out.println("Piercing Hole is NOT_OK");
		}
		if (slotWidth >= 7.25 && slotWidth <= 7.50) {
			System.out.println("Slot Width is OK");
		} else {
			System.out.println("Slot Width is NOT_OK");
		}
		if (webFlatness > 0 && webFlatness <= 0.30) {
			System.out.println("Web Flatness is OK");
		} else {
			System.out.println("Web Flatness is NOT_OK");
		}
		if (concavity > 0 && concavity <= 0.10) {
			System.out.println("Concavity is OK");
		} else {
			System.out.println("Concavity is NOT_OK");
		}
		if (pokaYoke.equalsIgnoreCase("Working")) {
			System.out.println("Poka-Yoke is OK");
		} else {
			System.out.println("Poka-Yoke is NOT_OK");
		}
		if (deburring.equalsIgnoreCase("Proper")) {
			System.out.println("Deburring is OK");
		} else {
			System.out.println("Deburring is NOT_OK");
		}
		if (hblGauge.equalsIgnoreCase("Free")) {
			System.out.println("HBL gauge is OK");
		} else {
			System.out.println("HBL gauge is NOT_OK");
		}
		if (visualCheck.equalsIgnoreCase("Visually OK")) {
			System.out.println("Visual check for lancing damage, burr, rim radially shift is OK");
		} else {
			System.out.println("Visual check is NOT_OK");
		}
		System.out.println(" ");
		if (((maxTopRadius - minTopRadius <= topRadiusVariationExpected)
				&& (topRadiusVariationExpected > 0 && topRadiusVariationExpected <= 0.30)
				&& (maxTopRadius <= 95.50 && minTopRadius >= 95.20))
				&& ((maxBottomRadius - minBottomRadius <= bottomRadiusVariationExpected)
				&& (bottomRadiusVariationExpected > 0 && bottomRadiusVariationExpected <= 0.30)
				&& (maxBottomRadius <= 95.50 && minBottomRadius >= 95.20))
				&& (squareness > 0 && squareness <= 0.20)
				&& (piercingHoleDiameter >= 6.08 && piercingHoleDiameter <= 6.38)
				&& (slotWidth >= 7.25 && slotWidth <= 7.50) && (webFlatness > 0 && webFlatness <= 0.30)
				&& (concavity > 0 && concavity <= 0.10) && (pokaYoke.equalsIgnoreCase("Working")) && (deburring.equalsIgnoreCase("Proper"))
				&& (hblGauge.equalsIgnoreCase("Free")) && (visualCheck.equalsIgnoreCase("Visually OK"))) {
			
			System.out.println("***First OFF Accepted***");
		} else {
			System.out.println("***First OFF Rejected***");
		}

	}

}
