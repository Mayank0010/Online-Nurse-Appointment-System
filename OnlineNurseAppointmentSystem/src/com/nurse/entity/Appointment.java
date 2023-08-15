package com.nurse.entity;

import java.util.Objects;

public class Appointment {
    private int appointmentId;
    private int customerId;
    private int serviceId;
    private String appointmentDate;
    private boolean appointmentStatus;
    
    
    public Appointment(int appointmentId, int customerId, int serviceId, String appointmentDate, boolean appointmentStatus) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }
    
    public int getAppointmentId() {
        return appointmentId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public int getServiceId() {
        return serviceId;
    }
    
    public void setAppointmentDate(String date) {
        this.appointmentDate = date;
    }
    
    public String getAppointmentDate() {
        return appointmentDate;
    }
    
    public void setAppointmentStatus(boolean status) {
        this.appointmentStatus = status;
    }
    
    public boolean getAppointmentStatus() {
        return appointmentStatus;
    }

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", customerId=" + customerId + ", serviceId=" + serviceId
				+ ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentDate, appointmentId, appointmentStatus, customerId, serviceId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(appointmentDate, other.appointmentDate) && appointmentId == other.appointmentId
				&& appointmentStatus == other.appointmentStatus && customerId == other.customerId
				&& serviceId == other.serviceId;
	}
    
    
}