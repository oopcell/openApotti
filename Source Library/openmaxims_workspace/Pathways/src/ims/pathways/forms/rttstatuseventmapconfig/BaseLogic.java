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

package ims.pathways.forms.rttstatuseventmapconfig;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.pathways.domain.RTTStatusEventMapConfig.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.pathways.domain.RTTStatusEventMapConfig domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void clearContextInformation()
	{
		engine.clearPatientContextInformation();
	}
	protected final void oncmbEncounterTypeSearchValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbEncounterTypeSearch().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.pathways.vo.lookups.EventEncounterType existingInstance = (ims.pathways.vo.lookups.EventEncounterType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEncounterTypeSearchLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.pathways.vo.lookups.EventEncounterType)
		{
			ims.pathways.vo.lookups.EventEncounterType instance = (ims.pathways.vo.lookups.EventEncounterType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEncounterTypeSearchLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.pathways.vo.lookups.EventEncounterType existingInstance = (ims.pathways.vo.lookups.EventEncounterType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbEncounterTypeSearch().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEncounterTypeSearchLookup()
	{
		this.form.cmbEncounterTypeSearch().clear();
		ims.pathways.vo.lookups.EventEncounterTypeCollection lookupCollection = ims.pathways.vo.lookups.LookupHelper.getEventEncounterType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbEncounterTypeSearch().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEncounterTypeSearchLookupValue(int id)
	{
		ims.pathways.vo.lookups.EventEncounterType instance = ims.pathways.vo.lookups.LookupHelper.getEventEncounterTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbEncounterTypeSearch().setValue(instance);
	}
	protected final void defaultcmbEncounterTypeSearchLookupValue()
	{
		this.form.cmbEncounterTypeSearch().setValue((ims.pathways.vo.lookups.EventEncounterType)domain.getLookupService().getDefaultInstance(ims.pathways.vo.lookups.EventEncounterType.class, engine.getFormName().getID(), ims.pathways.vo.lookups.EventEncounterType.TYPE_ID));
	}
	protected final void oncmbEncounterTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbEncounterType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.pathways.vo.lookups.EventEncounterType existingInstance = (ims.pathways.vo.lookups.EventEncounterType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbEncounterTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.pathways.vo.lookups.EventEncounterType)
		{
			ims.pathways.vo.lookups.EventEncounterType instance = (ims.pathways.vo.lookups.EventEncounterType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbEncounterTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.pathways.vo.lookups.EventEncounterType existingInstance = (ims.pathways.vo.lookups.EventEncounterType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbEncounterType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbEncounterTypeLookup()
	{
		this.form.ctnDetails().cmbEncounterType().clear();
		ims.pathways.vo.lookups.EventEncounterTypeCollection lookupCollection = ims.pathways.vo.lookups.LookupHelper.getEventEncounterType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbEncounterType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbEncounterTypeLookupValue(int id)
	{
		ims.pathways.vo.lookups.EventEncounterType instance = ims.pathways.vo.lookups.LookupHelper.getEventEncounterTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbEncounterType().setValue(instance);
	}
	protected final void defaultcmbEncounterTypeLookupValue()
	{
		this.form.ctnDetails().cmbEncounterType().setValue((ims.pathways.vo.lookups.EventEncounterType)domain.getLookupService().getDefaultInstance(ims.pathways.vo.lookups.EventEncounterType.class, engine.getFormName().getID(), ims.pathways.vo.lookups.EventEncounterType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.pathways.domain.RTTStatusEventMapConfig domain;
}