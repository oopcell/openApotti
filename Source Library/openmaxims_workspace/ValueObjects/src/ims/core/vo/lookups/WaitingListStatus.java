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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class WaitingListStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public WaitingListStatus()
	{
		super();
	}
	public WaitingListStatus(int id)
	{
		super(id, "", true);
	}
	public WaitingListStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public WaitingListStatus(int id, String text, boolean active, WaitingListStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public WaitingListStatus(int id, String text, boolean active, WaitingListStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public WaitingListStatus(int id, String text, boolean active, WaitingListStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static WaitingListStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new WaitingListStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (WaitingListStatus)super.getParentInstance();
	}
	public WaitingListStatus getParent()
	{
		return (WaitingListStatus)super.getParentInstance();
	}
	public void setParent(WaitingListStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		WaitingListStatus[] typedChildren = new WaitingListStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (WaitingListStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof WaitingListStatus)
		{
			super.addChild((WaitingListStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof WaitingListStatus)
		{
			super.removeChild((WaitingListStatus)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		WaitingListStatusCollection result = new WaitingListStatusCollection();
		result.add(CREATED);
		result.add(REQUIRES_TCI);
		result.add(REMOVED);
		result.add(SUSPENDED);
		result.add(TCI_GIVEN);
		result.add(ADMITTED);
		return result;
	}
	public static WaitingListStatus[] getNegativeInstances()
	{
		WaitingListStatus[] instances = new WaitingListStatus[6];
		instances[0] = CREATED;
		instances[1] = REQUIRES_TCI;
		instances[2] = REMOVED;
		instances[3] = SUSPENDED;
		instances[4] = TCI_GIVEN;
		instances[5] = ADMITTED;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[6];
		negativeInstances[0] = "CREATED";
		negativeInstances[1] = "REQUIRES_TCI";
		negativeInstances[2] = "REMOVED";
		negativeInstances[3] = "SUSPENDED";
		negativeInstances[4] = "TCI_GIVEN";
		negativeInstances[5] = "ADMITTED";
		return negativeInstances;
	}
	public static WaitingListStatus getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static WaitingListStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		WaitingListStatus[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1021288;
	public static final WaitingListStatus CREATED = new WaitingListStatus(-2601, "Created", true, null, null, Color.Default);
	public static final WaitingListStatus REQUIRES_TCI = new WaitingListStatus(-2602, "Requires TCI", true, null, null, Color.Default);
	public static final WaitingListStatus REMOVED = new WaitingListStatus(-2603, "Removed", true, null, null, Color.Default);
	public static final WaitingListStatus SUSPENDED = new WaitingListStatus(-2604, "Suspended", true, null, null, Color.Default);
	public static final WaitingListStatus TCI_GIVEN = new WaitingListStatus(-2605, "TCI Given", true, null, null, Color.Default);
	public static final WaitingListStatus ADMITTED = new WaitingListStatus(-2651, "Admitted", true, null, null, Color.Default);
}