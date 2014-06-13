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

package ims.core.vo;

/**
 * Linked to core.admin.pas.Inpatient Episode business object (ID: 1014100000).
 */
public class InpatientEpisodeForTransfersVo extends ims.core.admin.pas.vo.InpatientEpisodeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InpatientEpisodeForTransfersVo()
	{
	}
	public InpatientEpisodeForTransfersVo(Integer id, int version)
	{
		super(id, version);
	}
	public InpatientEpisodeForTransfersVo(ims.core.vo.beans.InpatientEpisodeForTransfersVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.wardstays = ims.core.vo.WardStayVoCollection.buildFromBeanCollection(bean.getWardStays());
		this.isonleave = bean.getIsOnLeave();
		this.pasevent = bean.getPasEvent() == null ? null : bean.getPasEvent().buildVo();
		this.comments = bean.getComments();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.InpatientEpisodeForTransfersVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.wardstays = ims.core.vo.WardStayVoCollection.buildFromBeanCollection(bean.getWardStays());
		this.isonleave = bean.getIsOnLeave();
		this.pasevent = bean.getPasEvent() == null ? null : bean.getPasEvent().buildVo(map);
		this.comments = bean.getComments();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.InpatientEpisodeForTransfersVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.InpatientEpisodeForTransfersVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.InpatientEpisodeForTransfersVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("WARDSTAYS"))
			return getWardStays();
		if(fieldName.equals("ISONLEAVE"))
			return getIsOnLeave();
		if(fieldName.equals("PASEVENT"))
			return getPasEvent();
		if(fieldName.equals("COMMENTS"))
			return getComments();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getWardStaysIsNotNull()
	{
		return this.wardstays != null;
	}
	public ims.core.vo.WardStayVoCollection getWardStays()
	{
		return this.wardstays;
	}
	public void setWardStays(ims.core.vo.WardStayVoCollection value)
	{
		this.isValidated = false;
		this.wardstays = value;
	}
	public boolean getIsOnLeaveIsNotNull()
	{
		return this.isonleave != null;
	}
	public Boolean getIsOnLeave()
	{
		return this.isonleave;
	}
	public void setIsOnLeave(Boolean value)
	{
		this.isValidated = false;
		this.isonleave = value;
	}
	public boolean getPasEventIsNotNull()
	{
		return this.pasevent != null;
	}
	public ims.core.vo.PasEventForSTHKListVo getPasEvent()
	{
		return this.pasevent;
	}
	public void setPasEvent(ims.core.vo.PasEventForSTHKListVo value)
	{
		this.isValidated = false;
		this.pasevent = value;
	}
	public boolean getCommentsIsNotNull()
	{
		return this.comments != null;
	}
	public String getComments()
	{
		return this.comments;
	}
	public static int getCommentsMaxLength()
	{
		return 1500;
	}
	public void setComments(String value)
	{
		this.isValidated = false;
		this.comments = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.wardstays != null)
		{
			if(!this.wardstays.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.pasevent != null)
		{
			if(!this.pasevent.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.wardstays != null)
		{
			String[] listOfOtherErrors = this.wardstays.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.pasevent != null)
		{
			String[] listOfOtherErrors = this.pasevent.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.comments != null)
			if(this.comments.length() > 1500)
				listOfErrors.add("The length of the field [comments] in the value object [ims.core.vo.InpatientEpisodeForTransfersVo] is too big. It should be less or equal to 1500");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		InpatientEpisodeForTransfersVo clone = new InpatientEpisodeForTransfersVo(this.id, this.version);
		
		if(this.wardstays == null)
			clone.wardstays = null;
		else
			clone.wardstays = (ims.core.vo.WardStayVoCollection)this.wardstays.clone();
		clone.isonleave = this.isonleave;
		if(this.pasevent == null)
			clone.pasevent = null;
		else
			clone.pasevent = (ims.core.vo.PasEventForSTHKListVo)this.pasevent.clone();
		clone.comments = this.comments;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(InpatientEpisodeForTransfersVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InpatientEpisodeForTransfersVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((InpatientEpisodeForTransfersVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((InpatientEpisodeForTransfersVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.wardstays != null)
			count++;
		if(this.isonleave != null)
			count++;
		if(this.pasevent != null)
			count++;
		if(this.comments != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.WardStayVoCollection wardstays;
	protected Boolean isonleave;
	protected ims.core.vo.PasEventForSTHKListVo pasevent;
	protected String comments;
	private boolean isValidated = false;
	private boolean isBusy = false;
}