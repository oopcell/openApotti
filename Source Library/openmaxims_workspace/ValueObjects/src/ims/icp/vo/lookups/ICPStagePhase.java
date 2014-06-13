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

package ims.icp.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ICPStagePhase extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ICPStagePhase()
	{
		super();
	}
	public ICPStagePhase(int id)
	{
		super(id, "", true);
	}
	public ICPStagePhase(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ICPStagePhase(int id, String text, boolean active, ICPStagePhase parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ICPStagePhase(int id, String text, boolean active, ICPStagePhase parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ICPStagePhase(int id, String text, boolean active, ICPStagePhase parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ICPStagePhase buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ICPStagePhase(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ICPStagePhase)super.getParentInstance();
	}
	public ICPStagePhase getParent()
	{
		return (ICPStagePhase)super.getParentInstance();
	}
	public void setParent(ICPStagePhase parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ICPStagePhase[] typedChildren = new ICPStagePhase[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ICPStagePhase)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ICPStagePhase)
		{
			super.addChild((ICPStagePhase)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ICPStagePhase)
		{
			super.removeChild((ICPStagePhase)child);
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
		ICPStagePhaseCollection result = new ICPStagePhaseCollection();
		result.add(STAGE);
		result.add(PHASE);
		return result;
	}
	public static ICPStagePhase[] getNegativeInstances()
	{
		ICPStagePhase[] instances = new ICPStagePhase[2];
		instances[0] = STAGE;
		instances[1] = PHASE;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "STAGE";
		negativeInstances[1] = "PHASE";
		return negativeInstances;
	}
	public static ICPStagePhase getNegativeInstance(String name)
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
	public static ICPStagePhase getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ICPStagePhase[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1181004;
	public static final ICPStagePhase STAGE = new ICPStagePhase(-332, "Stage", true, null, null, Color.Default);
	public static final ICPStagePhase PHASE = new ICPStagePhase(-333, "Phase", true, null, null, Color.Default);
}