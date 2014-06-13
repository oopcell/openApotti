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

package ims.spinalinjuries.shared.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ims.framework.enumerations.SortOrder;

/**
 * Linked to spinalinjuries.Shared.RespLungFields business object (ID: 1024100003).
 */
public class RespLungFieldsRefVoCollection extends ims.vo.ValueObjectCollection implements ims.domain.IDomainCollectionGetter, ims.vo.ImsCloneable, Iterable<RespLungFieldsRefVo>
{
	private static final long serialVersionUID = 1L;

	private ArrayList<RespLungFieldsRefVo> col = new ArrayList<RespLungFieldsRefVo>();
	public final String getBoClassName()
	{
		return "ims.spinalinjuries.shared.domain.objects.RespLungFields";
	}
	public ims.domain.IDomainGetter[] getIDomainGetterItems()
	{
		ims.domain.IDomainGetter[] result = new ims.domain.IDomainGetter[col.size()];
		col.toArray(result);
		return result;
	}
	public boolean add(RespLungFieldsRefVo value)
	{
		if(value == null)
			return false;
		if(this.col.indexOf(value) < 0)
		{
			return this.col.add(value);
		}
		return false;
	}
	public boolean add(int index, RespLungFieldsRefVo value)
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
	public int indexOf(RespLungFieldsRefVo instance)
	{
		return col.indexOf(instance);
	}
	public RespLungFieldsRefVo get(int index)
	{
		return this.col.get(index);
	}
	public boolean set(int index, RespLungFieldsRefVo value)
	{
		if(value == null)
			return false;
		this.col.set(index, value);
		return true;
	}
	public void remove(RespLungFieldsRefVo instance)
	{
		if(instance != null)
		{
			int index = indexOf(instance);
			if(index >= 0)
				remove(index);
		}
	}
	public boolean contains(RespLungFieldsRefVo instance)
	{
		return indexOf(instance) >= 0;
	}
	public Object clone()
	{
		RespLungFieldsRefVoCollection clone = new RespLungFieldsRefVoCollection();

		for(int x = 0; x < this.col.size(); x++)
		{
			if(this.col.get(x) != null)
				clone.col.add((RespLungFieldsRefVo)this.col.get(x).clone());
			else
				clone.col.add(null);
		}
		return clone;
	}
	public boolean isValidated()
	{
		return true;
	}
	public String[] validate()
	{
		return null;
	}
	public RespLungFieldsRefVo[] toArray()
	{
		RespLungFieldsRefVo[] arr = new RespLungFieldsRefVo[col.size()];
		col.toArray(arr);
		return arr;
	}
	public RespLungFieldsRefVoCollection sort()
	{
		return sort(SortOrder.ASCENDING);
	}
	public RespLungFieldsRefVoCollection sort(SortOrder order)
	{
		return sort(new RespLungFieldsRefVoComparator(order));
	}
	@SuppressWarnings("unchecked")
	public RespLungFieldsRefVoCollection sort(Comparator comparator)
	{
		Collections.sort(this.col, comparator);
		return this;
	}
	public Iterator<RespLungFieldsRefVo> iterator()
	{
		return col.iterator();
	}
	@Override
	protected ArrayList getTypedCollection()
	{
		return col;
	}
	private class RespLungFieldsRefVoComparator implements Comparator
	{
		private int direction = 1;
		public RespLungFieldsRefVoComparator()
		{
			this(SortOrder.ASCENDING);
		}
		public RespLungFieldsRefVoComparator(SortOrder order)
		{
			if (order == SortOrder.DESCENDING)
			{
				this.direction = -1;
			}
		}
		public int compare(Object obj1, Object obj2)
		{
			RespLungFieldsRefVo voObj1 = (RespLungFieldsRefVo)obj1;
			RespLungFieldsRefVo voObj2 = (RespLungFieldsRefVo)obj2;
			return direction*(voObj1.compareTo(voObj2));
		}
	}
}