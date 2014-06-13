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

package ims.therapies.vo;

/**
 * Linked to therapies.treatment.FrameExerciseSupport business object (ID: 1019100076).
 */
public class FrameExerciseSupportVo extends ims.therapies.treatment.vo.FrameExerciseSupportRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public FrameExerciseSupportVo()
	{
	}
	public FrameExerciseSupportVo(Integer id, int version)
	{
		super(id, version);
	}
	public FrameExerciseSupportVo(ims.therapies.vo.beans.FrameExerciseSupportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.framesupportexercise = bean.getFrameSupportExercise() == null ? null : ims.therapies.vo.lookups.StandingSupportTypeExercise.buildLookup(bean.getFrameSupportExercise());
		this.durationtime = bean.getDurationTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.therapies.vo.beans.FrameExerciseSupportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.framesupportexercise = bean.getFrameSupportExercise() == null ? null : ims.therapies.vo.lookups.StandingSupportTypeExercise.buildLookup(bean.getFrameSupportExercise());
		this.durationtime = bean.getDurationTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.therapies.vo.beans.FrameExerciseSupportVoBean bean = null;
		if(map != null)
			bean = (ims.therapies.vo.beans.FrameExerciseSupportVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.therapies.vo.beans.FrameExerciseSupportVoBean();
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
		if(fieldName.equals("FRAMESUPPORTEXERCISE"))
			return getFrameSupportExercise();
		if(fieldName.equals("DURATIONTIME"))
			return getDurationTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getFrameSupportExerciseIsNotNull()
	{
		return this.framesupportexercise != null;
	}
	public ims.therapies.vo.lookups.StandingSupportTypeExercise getFrameSupportExercise()
	{
		return this.framesupportexercise;
	}
	public void setFrameSupportExercise(ims.therapies.vo.lookups.StandingSupportTypeExercise value)
	{
		this.isValidated = false;
		this.framesupportexercise = value;
	}
	public boolean getDurationTimeIsNotNull()
	{
		return this.durationtime != null;
	}
	public Integer getDurationTime()
	{
		return this.durationtime;
	}
	public void setDurationTime(Integer value)
	{
		this.isValidated = false;
		this.durationtime = value;
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
	
		FrameExerciseSupportVo clone = new FrameExerciseSupportVo(this.id, this.version);
		
		if(this.framesupportexercise == null)
			clone.framesupportexercise = null;
		else
			clone.framesupportexercise = (ims.therapies.vo.lookups.StandingSupportTypeExercise)this.framesupportexercise.clone();
		clone.durationtime = this.durationtime;
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
		if (!(FrameExerciseSupportVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A FrameExerciseSupportVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		FrameExerciseSupportVo compareObj = (FrameExerciseSupportVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_FrameExerciseSupport() == null && compareObj.getID_FrameExerciseSupport() != null)
				return -1;
			if(this.getID_FrameExerciseSupport() != null && compareObj.getID_FrameExerciseSupport() == null)
				return 1;
			if(this.getID_FrameExerciseSupport() != null && compareObj.getID_FrameExerciseSupport() != null)
				retVal = this.getID_FrameExerciseSupport().compareTo(compareObj.getID_FrameExerciseSupport());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.framesupportexercise != null)
			count++;
		if(this.durationtime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.therapies.vo.lookups.StandingSupportTypeExercise framesupportexercise;
	protected Integer durationtime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}