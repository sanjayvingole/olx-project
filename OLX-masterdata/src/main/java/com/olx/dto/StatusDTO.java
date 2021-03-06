package com.olx.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value = "olx model holds the info about the olx status")
public class StatusDTO {
	@Id
	@ApiModelProperty(value = "Status id")
	private Integer id;
	@ApiModelProperty(value = "Status")
	private String status;

	public StatusDTO() {
		// TODO Auto-generated constructor stub
	}

	public StatusDTO(Integer id, String status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StatusDTO [id=" + id + ", status=" + status + "]";
	}

}
