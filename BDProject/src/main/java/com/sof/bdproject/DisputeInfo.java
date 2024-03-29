package com.sof.bdproject;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "DisputeInfo")
public class DisputeInfo  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Boolean approvalRequired;
    
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Boolean approvalStatus;
    
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String customerName;
    
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Float disputeAmount;

    public DisputeInfo() {
    }

    public DisputeInfo(java.lang.String customerName, java.lang.Float disputeAmount, java.lang.Boolean approvalRequired, java.lang.Boolean approvalStatus) {
        this.customerName = customerName;
        this.disputeAmount = disputeAmount;
        this.approvalRequired = approvalRequired;
        this.approvalStatus = approvalStatus;
    }


    
    public java.lang.Boolean getApprovalRequired() {
        return this.approvalRequired;
    }

    public void setApprovalRequired(  java.lang.Boolean approvalRequired ) {
        this.approvalRequired = approvalRequired;
    }
    
    public java.lang.Boolean getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(  java.lang.Boolean approvalStatus ) {
        this.approvalStatus = approvalStatus;
    }
    
    public java.lang.String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(  java.lang.String customerName ) {
        this.customerName = customerName;
    }
    
    public java.lang.Float getDisputeAmount() {
        return this.disputeAmount;
    }

    public void setDisputeAmount(  java.lang.Float disputeAmount ) {
        this.disputeAmount = disputeAmount;
    }
}