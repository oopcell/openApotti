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

package ims.scheduling.vo.beans;

public class ProfileParentChildSlotVoBean extends ims.vo.ValueObjectBean
{
	public ProfileParentChildSlotVoBean()
	{
	}
	public ProfileParentChildSlotVoBean(ims.scheduling.vo.ProfileParentChildSlotVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.noofinstances = vo.getNoOfInstances();
		this.isactive = vo.getIsActive();
		this.duration = vo.getDuration();
		this.endtm = vo.getEndTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTm().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.ProfileParentChildSlotVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.noofinstances = vo.getNoOfInstances();
		this.isactive = vo.getIsActive();
		this.duration = vo.getDuration();
		this.endtm = vo.getEndTm() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTm().getBean();
	}

	public ims.scheduling.vo.ProfileParentChildSlotVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.ProfileParentChildSlotVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.ProfileParentChildSlotVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.ProfileParentChildSlotVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.ProfileParentChildSlotVo();
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
	public ims.framework.utils.beans.TimeBean getStartTime()
	{
		return this.starttime;
	}
	public void setStartTime(ims.framework.utils.beans.TimeBean value)
	{
		this.starttime = value;
	}
	public Integer getNoOfInstances()
	{
		return this.noofinstances;
	}
	public void setNoOfInstances(Integer value)
	{
		this.noofinstances = value;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isactive = value;
	}
	public Integer getDuration()
	{
		return this.duration;
	}
	public void setDuration(Integer value)
	{
		this.duration = value;
	}
	public ims.framework.utils.beans.TimeBean getEndTm()
	{
		return this.endtm;
	}
	public void setEndTm(ims.framework.utils.beans.TimeBean value)
	{
		this.endtm = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.TimeBean starttime;
	private Integer noofinstances;
	private Boolean isactive;
	private Integer duration;
	private ims.framework.utils.beans.TimeBean endtm;
}