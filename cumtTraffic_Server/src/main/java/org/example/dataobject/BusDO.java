package org.example.dataobject;

public class BusDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_location.id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_location.bus_id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    private String busId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_location.latitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    private Double latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_location.longitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    private Double longitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_location.id
     *
     * @return the value of bus_location.id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_location.id
     *
     * @param id the value for bus_location.id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_location.bus_id
     *
     * @return the value of bus_location.bus_id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public String getBusId() {
        return busId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_location.bus_id
     *
     * @param busId the value for bus_location.bus_id
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public void setBusId(String busId) {
        this.busId = busId == null ? null : busId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_location.latitude
     *
     * @return the value of bus_location.latitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_location.latitude
     *
     * @param latitude the value for bus_location.latitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_location.longitude
     *
     * @return the value of bus_location.longitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_location.longitude
     *
     * @param longitude the value for bus_location.longitude
     *
     * @mbg.generated Sat May 15 21:03:55 HKT 2021
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}