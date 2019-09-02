package com.tanuj.dto;

import com.tanuj.model.Risk;

import java.util.Date;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 *
 */
public class RiskDTO {

    public RiskDTO(Risk risk){
        this.approvedBy= risk.getApprovedBy();
        this.approvedOn= risk.getApprovedOn();
        this.createdBy= risk.getCreatedBy();
        this.createdOn= risk.getCreatedOn();
        this.level= risk.getLevel();
        this.manager= risk.getManager();
        this.Organization= risk.getOrganization();
        this.owner= risk.getOwner();
        this.riskId= risk.getRiskId();
        this.status= risk.getStatus();
        this.title= risk.getTitle();
    }

    private String riskId;
    private String title;
    private String status;
    private String level;
    private String owner;
    private String manager;
    private String Organization;
    private Date createdOn;
    private String createdBy;
    private Date approvedOn;
    private String approvedBy;

    public String getRiskId() {
        return riskId;
    }

    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
}
