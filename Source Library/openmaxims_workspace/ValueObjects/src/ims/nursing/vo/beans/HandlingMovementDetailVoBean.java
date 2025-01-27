//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.nursing.vo.beans;

public class HandlingMovementDetailVoBean extends ims.vo.ValueObjectBean
{
	public HandlingMovementDetailVoBean()
	{
	}
	public HandlingMovementDetailVoBean(ims.nursing.vo.HandlingMovementDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.movement = vo.getMovement() == null ? null : (ims.vo.LookupInstanceBean)vo.getMovement().getBean();
		this.mechanicalequipment = vo.getMechanicalEquipment() == null ? null : vo.getMechanicalEquipment().getBeanCollection();
		this.otherequipment = vo.getOtherEquipment();
		this.noofstaff = vo.getNoOfStaff();
		this.details = vo.getDetails();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.nursing.vo.HandlingMovementDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.movement = vo.getMovement() == null ? null : (ims.vo.LookupInstanceBean)vo.getMovement().getBean();
		this.mechanicalequipment = vo.getMechanicalEquipment() == null ? null : vo.getMechanicalEquipment().getBeanCollection();
		this.otherequipment = vo.getOtherEquipment();
		this.noofstaff = vo.getNoOfStaff();
		this.details = vo.getDetails();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
	}

	public ims.nursing.vo.HandlingMovementDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.nursing.vo.HandlingMovementDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.nursing.vo.HandlingMovementDetailVo vo = null;
		if(map != null)
			vo = (ims.nursing.vo.HandlingMovementDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.nursing.vo.HandlingMovementDetailVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.vo.LookupInstanceBean getMovement()
	{
		return this.movement;
	}
	public void setMovement(ims.vo.LookupInstanceBean value)
	{
		this.movement = value;
	}
	public java.util.Collection getMechanicalEquipment()
	{
		return this.mechanicalequipment;
	}
	public void setMechanicalEquipment(java.util.Collection value)
	{
		this.mechanicalequipment = value;
	}
	public void addMechanicalEquipment(java.util.Collection value)
	{
		if(this.mechanicalequipment == null)
			this.mechanicalequipment = new java.util.ArrayList();
		this.mechanicalequipment.add(value);
	}
	public String getOtherEquipment()
	{
		return this.otherequipment;
	}
	public void setOtherEquipment(String value)
	{
		this.otherequipment = value;
	}
	public Integer getNoOfStaff()
	{
		return this.noofstaff;
	}
	public void setNoOfStaff(Integer value)
	{
		this.noofstaff = value;
	}
	public String getDetails()
	{
		return this.details;
	}
	public void setDetails(String value)
	{
		this.details = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean movement;
	private java.util.Collection mechanicalequipment;
	private String otherequipment;
	private Integer noofstaff;
	private String details;
	private ims.vo.SysInfoBean sysinfo;
}
