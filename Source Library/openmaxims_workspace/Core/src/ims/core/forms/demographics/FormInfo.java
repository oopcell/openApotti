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

package ims.core.forms.demographics;

public final class FormInfo extends ims.framework.FormInfo
{
	private static final long serialVersionUID = 1L;
	public FormInfo(Integer formId)
	{
		super(formId);
	}
	public String getNamespaceName()
	{
		return "Core";
	}
	public String getFormName()
	{
		return "Demographics";
	}
	public int getWidth()
	{
		return 848;
	}
	public int getHeight()
	{
		return 632;
	}
	public String[] getContextVariables()
	{
		return new String[] { "_cv_Core.YesNoDialogMessage", "_cv_Core.GPDetails", "_cv_Core.NOKDetails", "_cv_Core.OtherNames", "_cv_Core.OtherAddresses", "_cv_Core.ParentFormMode", "_cv_Core.GPPractice", "_cv_Core.GPSurgery", "_cv_Core.HideCancelButton", "_cv_Core.PatientToBeDisplayed", "_cv_Core.DeathDetails", "_cv_Core.PersonAddress", "_cv_Core.AddressSearchType", "_cv_Core.AddressSearchText", "_cv_Core.NOKPersonAddress", "_cv_Core.CommentDialogString", "_cv_Core.PatientImage", "_cv_Core.PatientPhotoTempFiles", "_cv_Core.CommentDialogReadOnly", "_cv_Core.CommentDialogTitle", "_cv_Core.AliasName", "_cv_Core.CommChannels", "_cv_Core.OutpatientAttendanceForOrder", "_cv_Core.GPPracticeWithComm" };
	}
	public String getLocalVariablesPrefix()
	{
		return "_lv_Core.Demographics.__internal_x_context__" + String.valueOf(getFormId());
	}
	public ims.framework.FormInfo[] getComponentsFormInfo()
	{
		ims.framework.FormInfo[] componentsInfo = new ims.framework.FormInfo[3];
		componentsInfo[0] = new ims.core.forms.patientdetails.FormInfo(102376);
		componentsInfo[1] = new ims.core.forms.patientimagedisplay.FormInfo(102337);
		componentsInfo[2] = new ims.core.forms.addresssearch.FormInfo(102278);
		return componentsInfo;
	}
	public String getImagePath()
	{
		return "Images/Core/Medical_History_48.png";
	}
}