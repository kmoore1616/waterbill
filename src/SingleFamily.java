public class SingleFamily extends Customer{

    private final double SINGLE_BASE = 13.21;
    private final int SINGLE_TIER1 = 7000;
    private final double SINGLE_TIER1_COST = 2.04;
    private final int SINGLE_TIER2 = 6000;
    private final double SINGLE_TIER2_COST = 2.35;
    private final double SINGLE_TIER3_COST = 2.70;



    public void calculateBill() {
        int gallonsUsed = getGallonsUsed();
        int tier2_cutoff = getTIER2_CUTOFF();
        double gallons = getGALLONS();
        if (gallonsUsed <= SINGLE_TIER1) {
            this.bill = SINGLE_BASE + gallonsUsed * (SINGLE_TIER1_COST / gallons);
        } else if (gallonsUsed <= tier2_cutoff) {
            bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / gallons)
                    + (gallonsUsed - SINGLE_TIER1) * (SINGLE_TIER2_COST / gallons);
        } else {
            bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / gallons)
                    + SINGLE_TIER2 * (SINGLE_TIER2_COST / gallons)
                    + (gallonsUsed - tier2_cutoff) * (SINGLE_TIER3_COST / gallons);
        }
    }

}
