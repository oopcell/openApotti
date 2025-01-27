//This code was generated by Catalin Tomozei using IMS Development Environment (version 1.71 build 3625.26452)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.correspondencenotedialog;

import ims.RefMan.vo.CorrespondenceNoteVo;
import ims.RefMan.vo.lookups.ReportNoteStatus;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.MemberOfStaffLiteVo;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setEditedRecord(form.getGlobalContext().RefMan.getEditedReportNote());
		form.ccAuthoring().initializeComponent();
		bindcmbStatusLookup();
		populateScreenFromData(form.getLocalContext().getEditedRecord());		
	}
	
	private void bindcmbStatusLookup()
	{
		form.cmbStatus().clear();
		ims.RefMan.vo.lookups.ReportNoteStatusCollection lookupCollection = ims.RefMan.vo.lookups.LookupHelper.getReportNoteStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			if (!lookupCollection.get(x).equals(ReportNoteStatus.PREVIEW)) {
				form.cmbStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
			}
		}
	}
	
	private void populateScreenFromData(CorrespondenceNoteVo editedReportNote) 
	{	
		if (editedReportNote != null)
		{
			form.ccAuthoring().setValue(editedReportNote.getAuthoringInformation());
			form.cmbReportNoteType().setValue(editedReportNote.getNoteType());
			form.cmbStatus().setValue(editedReportNote.getNoteStatus());
			form.richTextNote().setValue(editedReportNote.getReportNote());
			form.chkCopyToGP().setValue(editedReportNote.getCopyToGP());
			form.chkCopyToPatient().setValue(editedReportNote.getCopyToPatient());
			form.chkCopyToSecondaryCare().setValue(editedReportNote.getCopyToSecondaryCare());
		}
	}
	
	private CorrespondenceNoteVo populateDataFromScreen() 
	{	
		CorrespondenceNoteVo editedReportNote = form.getLocalContext().getEditedRecord();
		if (editedReportNote == null) {
			editedReportNote = new CorrespondenceNoteVo();
		}		
		
		editedReportNote.setAuthoringInformation(form.ccAuthoring().getValue());
		editedReportNote.setCatsReferral(form.getGlobalContext().RefMan.getCatsReferral());
		editedReportNote.setNoteType(form.cmbReportNoteType().getValue());
		editedReportNote.setNoteStatus(form.cmbStatus().getValue());
		editedReportNote.setReportNote(form.richTextNote().getValue());
		editedReportNote.setCopyToGP(form.chkCopyToGP().getValue());
		editedReportNote.setCopyToPatient(form.chkCopyToPatient().getValue());
		editedReportNote.setCopyToSecondaryCare(form.chkCopyToSecondaryCare().getValue());
		
		AuthoringInformationVo recording = new AuthoringInformationVo();
		recording.setAuthoringDateTime(new DateTime());
		HcpLiteVo hcp = new HcpLiteVo();
		hcp.setID_Hcp(engine.getLoggedInUser().getHcpId());
		hcp.setMos(domain.getMosUser() != null ? (MemberOfStaffLiteVo) domain.getMosUser() : null);
		recording.setAuthoringHcp(hcp);					
		editedReportNote.setRecordingInformation(recording);		
		
		return editedReportNote;
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (!validateData())
			return;
		
		if (save()) {		
			engine.close(DialogResult.OK);
		}
	}
	
	private boolean validateData() 
	{
		if (form.chkCopyToGP().getValue() == Boolean.FALSE
			&& form.chkCopyToPatient().getValue() == Boolean.FALSE
			&& form.chkCopyToSecondaryCare().getValue() == Boolean.FALSE)
		{
			engine.showMessage("Please select at least one of the Copy To checkboxes and save again.", "Validation Error");
			return false;
		}
		return true;
	}

	private boolean save() 
	{
		CorrespondenceNoteVo editedReportNote = populateDataFromScreen();
		String[] str 	= editedReportNote.validate();
		if (str != null && str.length > 0)
		{
			engine.showErrors(str);			
			return false;
		}
		
		form.getLocalContext().setEditedRecord(editedReportNote);
		form.getGlobalContext().RefMan.setEditedReportNote(editedReportNote);
				
		return true;
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	@Override
	protected void onBtnSpellCheckClick() throws PresentationLogicException 
	{	
		form.richTextNote().spellCheck();
	}
}
