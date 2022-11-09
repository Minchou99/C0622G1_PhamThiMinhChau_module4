package com.example.dto.contract;

public class ContractDto {
    private Integer id;
    private String startDate;
    private String endDate;
    private Double deposit;
    private String employeeId;
    private String customerId;
    private String contractDetailId;
    private String facilityId;

    public ContractDto() {
    }

    public ContractDto(Integer id, String startDate, String endDate, Double deposit) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }
}
