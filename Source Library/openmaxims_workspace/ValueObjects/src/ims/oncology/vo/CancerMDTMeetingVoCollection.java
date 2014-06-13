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

package ims.oncology.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to Oncology.CancerMDTMeeting business object (ID: 1074100017).
 */
public class CancerMDTMeetingVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<CancerMDTMeetingVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<CancerMDTMeetingVo> col = new ArrayList<CancerMDTMeetingVo>();
	public String getBoClassName()
	{
		return "ims.oncology.domain.objects.CancerMDTMeeting";
	}
	public boolean add(CancerMDTMeetingVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, CancerMDTMeetingVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			this.col.add(index, value);
			return true;
		}
		return false;
	}
	public void clear()
	{
		this.col.clear();
	}
	public void remove(int index)
	{
		this.col.remove(index);
	}
	public int size()
	{
		return this.col.size();
	}
	public int indexOf(CancerMDTMeetingVo instance)
	{
		return col.indexOf(instance);
	}
	public CancerMDTMeetingVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, CancerMDTMeetingVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(CancerMDTMeetingVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(CancerMDTMeetingVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		CancerMDTMeetingVoCollection clone = new CancerMDTMeetingVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((CancerMDTMeetingVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		
		return clone;
	}
	public boolean isValidated()
	{
		for(int x = 0; x < col.size(); x++)
			if(!this.col.get(x).isValidated())
				return false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(col.size() == 0)
			return null;
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		for(int x = 0; x < col.size(); x++)
		{
			String[] listOfOtherErrors = this.col.get(x).validate();
			if(listOfOtherErrors != null)
			{
				for(int y = 0; y < listOfOtherErrors.length; y++)
				{
					listOfErrors.add(listOfOtherErrors[y]);
				}
			}
		}
		
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
			return null;
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		return result;
	}
	public CancerMDTMeetingVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public CancerMDTMeetingVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public CancerMDTMeetingVoCollection sort(SortOrder order)
	{
		return sort(new CancerMDTMeetingVoComparator(order));
	}
	public CancerMDTMeetingVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new CancerMDTMeetingVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public CancerMDTMeetingVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.oncology.vo.CancerMDTMeetingRefVoCollection toRefVoCollection()
	{
		ims.oncology.vo.CancerMDTMeetingRefVoCollection result = new ims.oncology.vo.CancerMDTMeetingRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public CancerMDTMeetingVo[] toArray()
	{
		CancerMDTMeetingVo[] arr = new CancerMDTMeetingVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<CancerMDTMeetingVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class CancerMDTMeetingVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public CancerMDTMeetingVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public CancerMDTMeetingVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public CancerMDTMeetingVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			CancerMDTMeetingVo voObj1 = (CancerMDTMeetingVo)obj1;
			CancerMDTMeetingVo voObj2 = (CancerMDTMeetingVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.oncology.vo.beans.CancerMDTMeetingVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.oncology.vo.beans.CancerMDTMeetingVoBean[] getBeanCollectionArray()
	{
		ims.oncology.vo.beans.CancerMDTMeetingVoBean[] result = new ims.oncology.vo.beans.CancerMDTMeetingVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			CancerMDTMeetingVo vo = ((CancerMDTMeetingVo)col.get(i));
			result[i] = (ims.oncology.vo.beans.CancerMDTMeetingVoBean)vo.getBean();
		}
		return result;
	}
	public static CancerMDTMeetingVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		CancerMDTMeetingVoCollection coll = new CancerMDTMeetingVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.oncology.vo.beans.CancerMDTMeetingVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static CancerMDTMeetingVoCollection buildFromBeanCollection(ims.oncology.vo.beans.CancerMDTMeetingVoBean[] beans)
	{
		CancerMDTMeetingVoCollection coll = new CancerMDTMeetingVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}