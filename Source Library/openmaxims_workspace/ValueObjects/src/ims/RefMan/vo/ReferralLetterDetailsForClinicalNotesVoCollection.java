// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to core.clinical.ReferralLetterDetails business object (ID: 1003100093).
 */
public class ReferralLetterDetailsForClinicalNotesVoCollection extends ims.vo.ValueObjectCollection implements ims.vo.ImsCloneable, Iterable<ReferralLetterDetailsForClinicalNotesVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<ReferralLetterDetailsForClinicalNotesVo> col = new ArrayList<ReferralLetterDetailsForClinicalNotesVo>();
	public String getBoClassName()
	{
		return "ims.core.clinical.domain.objects.ReferralLetterDetails";
	}
	public boolean add(ReferralLetterDetailsForClinicalNotesVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, ReferralLetterDetailsForClinicalNotesVo value)
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
	public int indexOf(ReferralLetterDetailsForClinicalNotesVo instance)
	{
		return col.indexOf(instance);
	}
	public ReferralLetterDetailsForClinicalNotesVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, ReferralLetterDetailsForClinicalNotesVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(ReferralLetterDetailsForClinicalNotesVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(ReferralLetterDetailsForClinicalNotesVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		ReferralLetterDetailsForClinicalNotesVoCollection clone = new ReferralLetterDetailsForClinicalNotesVoCollection();
		
		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((ReferralLetterDetailsForClinicalNotesVo)this.col.get(x).clone());
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
	public ReferralLetterDetailsForClinicalNotesVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public ReferralLetterDetailsForClinicalNotesVoCollection sort(boolean caseInsensitive)
	{
		return sort(SortOrder.ASCENDING, caseInsensitive);
	}
	public ReferralLetterDetailsForClinicalNotesVoCollection sort(SortOrder order)
	{
		return sort(new ReferralLetterDetailsForClinicalNotesVoComparator(order));
	}
	public ReferralLetterDetailsForClinicalNotesVoCollection sort(SortOrder order, boolean caseInsensitive)
	{
		return sort(new ReferralLetterDetailsForClinicalNotesVoComparator(order, caseInsensitive));
	}
	@SuppressWarnings("unchecked")
	public ReferralLetterDetailsForClinicalNotesVoCollection sort(Comparator comparator)
	{
		Collections.sort(col, comparator);
		return this;
	}
	public ims.core.clinical.vo.ReferralLetterDetailsRefVoCollection toRefVoCollection()
	{
		ims.core.clinical.vo.ReferralLetterDetailsRefVoCollection result = new ims.core.clinical.vo.ReferralLetterDetailsRefVoCollection();
		for(int x = 0; x < this.col.size(); x++)
		{
			result.add(this.col.get(x));
		}
		return result;
	}
	public ReferralLetterDetailsForClinicalNotesVo[] toArray()
	{
		ReferralLetterDetailsForClinicalNotesVo[] arr = new ReferralLetterDetailsForClinicalNotesVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public Iterator<ReferralLetterDetailsForClinicalNotesVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class ReferralLetterDetailsForClinicalNotesVoComparator implements Comparator
	{
		private int direction = 1;
		private boolean caseInsensitive = true;
		public ReferralLetterDetailsForClinicalNotesVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public ReferralLetterDetailsForClinicalNotesVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
		}
		public ReferralLetterDetailsForClinicalNotesVoComparator(SortOrder order, boolean caseInsensitive)
		{
			if (order == SortOrder.DESCENDING)
			{
				direction = -1;
			}
			this.caseInsensitive = caseInsensitive;
		}
		public int compare(Object obj1, Object obj2)
		{
			ReferralLetterDetailsForClinicalNotesVo voObj1 = (ReferralLetterDetailsForClinicalNotesVo)obj1;
			ReferralLetterDetailsForClinicalNotesVo voObj2 = (ReferralLetterDetailsForClinicalNotesVo)obj2;
			return direction*(voObj1.compareTo(voObj2, this.caseInsensitive));
		}
		public boolean equals(Object obj)
		{
			return false;
		}
	}
	public ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean[] getBeanCollection()
	{
		return getBeanCollectionArray();
	}
	public ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean[] getBeanCollectionArray()
	{
		ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean[] result = new ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean[col.size()];
		for(int i = 0; i < col.size(); i++)
		{
			ReferralLetterDetailsForClinicalNotesVo vo = ((ReferralLetterDetailsForClinicalNotesVo)col.get(i));
			result[i] = (ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean)vo.getBean();
		}
		return result;
	}
	public static ReferralLetterDetailsForClinicalNotesVoCollection buildFromBeanCollection(java.util.Collection beans)
	{
		ReferralLetterDetailsForClinicalNotesVoCollection coll = new ReferralLetterDetailsForClinicalNotesVoCollection();
		if(beans == null)
			return coll;
		java.util.Iterator iter = beans.iterator();
		while (iter.hasNext())
		{
			coll.add(((ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean)iter.next()).buildVo());
		}
		return coll;
	}
	public static ReferralLetterDetailsForClinicalNotesVoCollection buildFromBeanCollection(ims.RefMan.vo.beans.ReferralLetterDetailsForClinicalNotesVoBean[] beans)
	{
		ReferralLetterDetailsForClinicalNotesVoCollection coll = new ReferralLetterDetailsForClinicalNotesVoCollection();
		if(beans == null)
			return coll;
		for(int x = 0; x < beans.length; x++)
		{
			coll.add(beans[x].buildVo());
		}
		return coll;
	}
}
