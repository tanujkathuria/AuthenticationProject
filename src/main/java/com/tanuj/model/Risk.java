package com.tanuj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Tanuj Kathuria
 * @version 1.0
 */
@Entity
@Table(name = "RiskDetails")
public class Risk {

    @Id
    @Column(name="RiskId")
    private String riskId;
    @Column(name="Title")
    private String title;
    @Column(name="Status")
    private String status;
    @Column(name="level")
    private String level;
    @Column(name="Owner")
    private String owner;
    @Column(name="Manager")
    private String manager;
    @Column(name="Organization")
    private String Organization;
    @Column(name="CreatedOn")
    private Date createdOn;
    @Column(name="CreatedBy")
    private String createdBy;
    @Column(name="ApprovedOn")
    private Date approvedOn;
    @Column(name="ApprovedBy")
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
