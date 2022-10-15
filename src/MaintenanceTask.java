public class MaintenanceTask {
    private int mileageOfLastMaintenance;
    private int mileageOfNextMaintenance;
    private Double maintenanceCost;


    public int getMileageOfLastMaintenance() {
        return mileageOfLastMaintenance;
    }

    public void setMileageOfLastMaintenance(int mileageOfLastMaintenance) {
        this.mileageOfLastMaintenance = mileageOfLastMaintenance;
    }

    public int getMileageOfNextMaintenance() {
        return mileageOfNextMaintenance;
    }

    public void setMileageOfNextMaintenance(int mileageOfNextMaintenance) {
        this.mileageOfNextMaintenance = mileageOfNextMaintenance;
    }

    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }
}