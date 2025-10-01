public class Duplex extends Customer{
    private final double DUPLEX_BASE = 15.51;
    private final int DUPLEX_TIER1 = 9000;
    private final double DUPLEX_TIER1_COST = 1.97;
    private final int DUPLEX_TIER2 = 4000;
    private final double DUPLEX_TIER2_COST = 2.26;
    private final double DUPLEX_TIER3_COST = 2.60;


    public void calculateBill() {
        int gallonsUsed = getGallonsUsed();
        int tier2_cutoff = getTIER2_CUTOFF();
        double gallons = getGALLONS();
        if (gallonsUsed <= DUPLEX_TIER1) {
            bill = DUPLEX_BASE + gallonsUsed * (DUPLEX_TIER1_COST / gallons);
        } else if (gallonsUsed <= tier2_cutoff) {
            bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / gallons)
                    + (gallonsUsed - DUPLEX_TIER1) * (DUPLEX_TIER2_COST / gallons);
        } else {
            bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / gallons)
                    + DUPLEX_TIER2 * (DUPLEX_TIER2_COST / gallons)
                    + (gallonsUsed - tier2_cutoff) * (DUPLEX_TIER3_COST / gallons);
        }
    }





}