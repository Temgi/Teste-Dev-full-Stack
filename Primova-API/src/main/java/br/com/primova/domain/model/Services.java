package br.com.primova.domain.model;

import java.io.Serializable;

public class Services implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private String routeCode;
    private String routeMnemonic;
    private Integer companyId;
    private Integer stopId;
    private Integer serviceId;
    private String serviceMnemonic; 
    private String predictionType;
    private Integer activeVehicles;
    private Integer scheduledVehicles;
	
    
    public String getRouteCode() {
		return routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}
	public String getRouteMnemonic() {
		return routeMnemonic;
	}
	public void setRouteMnemonic(String routeMnemonic) {
		this.routeMnemonic = routeMnemonic;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getStopId() {
		return stopId;
	}
	public void setStopId(Integer stopId) {
		this.stopId = stopId;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceMnemonic() {
		return serviceMnemonic;
	}
	public void setServiceMnemonic(String serviceMnemonic) {
		this.serviceMnemonic = serviceMnemonic;
	}
	public String getPredictionType() {
		return predictionType;
	}
	public void setPredictionType(String predictionType) {
		this.predictionType = predictionType;
	}
	public Integer getActiveVehicles() {
		return activeVehicles;
	}
	public void setActiveVehicles(Integer activeVehicles) {
		this.activeVehicles = activeVehicles;
	}
	public Integer getScheduledVehicles() {
		return scheduledVehicles;
	}
	public void setScheduledVehicles(Integer scheduledVehicles) {
		this.scheduledVehicles = scheduledVehicles;
	}
}