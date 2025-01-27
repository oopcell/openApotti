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

package ims.emergency.vo;

/**
 * Linked to emergency.Tracking business object (ID: 1086100005).
 */
public class TrackingForQuickRegistrationVo extends ims.emergency.vo.TrackingRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TrackingForQuickRegistrationVo()
	{
	}
	public TrackingForQuickRegistrationVo(Integer id, int version)
	{
		super(id, version);
	}
	public TrackingForQuickRegistrationVo(ims.emergency.vo.beans.TrackingForQuickRegistrationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.attendance = bean.getAttendance() == null ? null : new ims.core.admin.vo.EmergencyAttendanceRefVo(new Integer(bean.getAttendance().getId()), bean.getAttendance().getVersion());
		this.episode = bean.getEpisode() == null ? null : new ims.core.admin.vo.EmergencyEpisodeRefVo(new Integer(bean.getEpisode().getId()), bean.getEpisode().getVersion());
		this.edlocation = bean.getEDLocation() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getEDLocation().getId()), bean.getEDLocation().getVersion());
		this.isunknownpatient = bean.getIsUnknownPatient();
		this.currentarea = bean.getCurrentArea() == null ? null : bean.getCurrentArea().buildVo();
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo();
		this.dischargeletterstatus = bean.getDischargeLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeLetterStatus.buildLookup(bean.getDischargeLetterStatus());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.TrackingForQuickRegistrationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.attendance = bean.getAttendance() == null ? null : new ims.core.admin.vo.EmergencyAttendanceRefVo(new Integer(bean.getAttendance().getId()), bean.getAttendance().getVersion());
		this.episode = bean.getEpisode() == null ? null : new ims.core.admin.vo.EmergencyEpisodeRefVo(new Integer(bean.getEpisode().getId()), bean.getEpisode().getVersion());
		this.edlocation = bean.getEDLocation() == null ? null : new ims.core.resource.place.vo.LocationRefVo(new Integer(bean.getEDLocation().getId()), bean.getEDLocation().getVersion());
		this.isunknownpatient = bean.getIsUnknownPatient();
		this.currentarea = bean.getCurrentArea() == null ? null : bean.getCurrentArea().buildVo(map);
		this.currentstatus = bean.getCurrentStatus() == null ? null : bean.getCurrentStatus().buildVo(map);
		this.dischargeletterstatus = bean.getDischargeLetterStatus() == null ? null : ims.clinical.vo.lookups.DischargeLetterStatus.buildLookup(bean.getDischargeLetterStatus());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.TrackingForQuickRegistrationVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.TrackingForQuickRegistrationVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.TrackingForQuickRegistrationVoBean();
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
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("ATTENDANCE"))
			return getAttendance();
		if(fieldName.equals("EPISODE"))
			return getEpisode();
		if(fieldName.equals("EDLOCATION"))
			return getEDLocation();
		if(fieldName.equals("ISUNKNOWNPATIENT"))
			return getIsUnknownPatient();
		if(fieldName.equals("CURRENTAREA"))
			return getCurrentArea();
		if(fieldName.equals("CURRENTSTATUS"))
			return getCurrentStatus();
		if(fieldName.equals("DISCHARGELETTERSTATUS"))
			return getDischargeLetterStatus();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getAttendanceIsNotNull()
	{
		return this.attendance != null;
	}
	public ims.core.admin.vo.EmergencyAttendanceRefVo getAttendance()
	{
		return this.attendance;
	}
	public void setAttendance(ims.core.admin.vo.EmergencyAttendanceRefVo value)
	{
		this.isValidated = false;
		this.attendance = value;
	}
	public boolean getEpisodeIsNotNull()
	{
		return this.episode != null;
	}
	public ims.core.admin.vo.EmergencyEpisodeRefVo getEpisode()
	{
		return this.episode;
	}
	public void setEpisode(ims.core.admin.vo.EmergencyEpisodeRefVo value)
	{
		this.isValidated = false;
		this.episode = value;
	}
	public boolean getEDLocationIsNotNull()
	{
		return this.edlocation != null;
	}
	public ims.core.resource.place.vo.LocationRefVo getEDLocation()
	{
		return this.edlocation;
	}
	public void setEDLocation(ims.core.resource.place.vo.LocationRefVo value)
	{
		this.isValidated = false;
		this.edlocation = value;
	}
	public boolean getIsUnknownPatientIsNotNull()
	{
		return this.isunknownpatient != null;
	}
	public Boolean getIsUnknownPatient()
	{
		return this.isunknownpatient;
	}
	public void setIsUnknownPatient(Boolean value)
	{
		this.isValidated = false;
		this.isunknownpatient = value;
	}
	public boolean getCurrentAreaIsNotNull()
	{
		return this.currentarea != null;
	}
	public ims.emergency.vo.TrackingAreaVo getCurrentArea()
	{
		return this.currentarea;
	}
	public void setCurrentArea(ims.emergency.vo.TrackingAreaVo value)
	{
		this.isValidated = false;
		this.currentarea = value;
	}
	public boolean getCurrentStatusIsNotNull()
	{
		return this.currentstatus != null;
	}
	public ims.emergency.vo.TrackingAttendanceStatusVo getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.emergency.vo.TrackingAttendanceStatusVo value)
	{
		this.isValidated = false;
		this.currentstatus = value;
	}
	public boolean getDischargeLetterStatusIsNotNull()
	{
		return this.dischargeletterstatus != null;
	}
	public ims.clinical.vo.lookups.DischargeLetterStatus getDischargeLetterStatus()
	{
		return this.dischargeletterstatus;
	}
	public void setDischargeLetterStatus(ims.clinical.vo.lookups.DischargeLetterStatus value)
	{
		this.isValidated = false;
		this.dischargeletterstatus = value;
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
		if(this.currentstatus != null)
		{
			if(!this.currentstatus.isValidated())
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
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.attendance == null)
			listOfErrors.add("Attendance is mandatory");
		if(this.episode == null)
			listOfErrors.add("Episode is mandatory");
		if(this.edlocation == null)
			listOfErrors.add("EDLocation is mandatory");
		if(this.currentstatus != null)
		{
			String[] listOfOtherErrors = this.currentstatus.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.dischargeletterstatus == null)
			listOfErrors.add("DischargeLetterStatus is mandatory");
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
	
		TrackingForQuickRegistrationVo clone = new TrackingForQuickRegistrationVo(this.id, this.version);
		
		clone.patient = this.patient;
		clone.attendance = this.attendance;
		clone.episode = this.episode;
		clone.edlocation = this.edlocation;
		clone.isunknownpatient = this.isunknownpatient;
		if(this.currentarea == null)
			clone.currentarea = null;
		else
			clone.currentarea = (ims.emergency.vo.TrackingAreaVo)this.currentarea.clone();
		if(this.currentstatus == null)
			clone.currentstatus = null;
		else
			clone.currentstatus = (ims.emergency.vo.TrackingAttendanceStatusVo)this.currentstatus.clone();
		if(this.dischargeletterstatus == null)
			clone.dischargeletterstatus = null;
		else
			clone.dischargeletterstatus = (ims.clinical.vo.lookups.DischargeLetterStatus)this.dischargeletterstatus.clone();
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
		if (!(TrackingForQuickRegistrationVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TrackingForQuickRegistrationVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TrackingForQuickRegistrationVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TrackingForQuickRegistrationVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.patient != null)
			count++;
		if(this.attendance != null)
			count++;
		if(this.episode != null)
			count++;
		if(this.edlocation != null)
			count++;
		if(this.isunknownpatient != null)
			count++;
		if(this.currentarea != null)
			count++;
		if(this.currentstatus != null)
			count++;
		if(this.dischargeletterstatus != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.admin.vo.EmergencyAttendanceRefVo attendance;
	protected ims.core.admin.vo.EmergencyEpisodeRefVo episode;
	protected ims.core.resource.place.vo.LocationRefVo edlocation;
	protected Boolean isunknownpatient;
	protected ims.emergency.vo.TrackingAreaVo currentarea;
	protected ims.emergency.vo.TrackingAttendanceStatusVo currentstatus;
	protected ims.clinical.vo.lookups.DischargeLetterStatus dischargeletterstatus;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
