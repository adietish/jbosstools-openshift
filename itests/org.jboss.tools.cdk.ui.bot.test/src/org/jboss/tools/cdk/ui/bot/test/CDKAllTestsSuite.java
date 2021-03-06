/******************************************************************************* 
 * Copyright (c) 2017 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.cdk.ui.bot.test;

import org.eclipse.reddeer.junit.runner.RedDeerSuite;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.CDK32IntegrationTest;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.CDK32ServerAdapterProfilesTest;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.CDKServerAdapterSetupCDKTest;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.openshift.CDKImageRegistryUrlDiscoveryFailureTest;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.openshift.CDKImageRegistryUrlDiscoveryTest;
import org.jboss.tools.cdk.ui.bot.test.server.adapter.openshift.CDKImageRegistryUrlValidatorTest;
import org.jboss.tools.cdk.ui.bot.test.server.editor.CDK32ServerEditorTest;
import org.jboss.tools.cdk.ui.bot.test.server.editor.CDK3ServerEditorTest;
import org.jboss.tools.cdk.ui.bot.test.server.editor.launch.CDKLaunchConfigurationTest;
import org.jboss.tools.cdk.ui.bot.test.server.runtime.CDK32RuntimeDetectionDevstudioStartUpTest;
import org.jboss.tools.cdk.ui.bot.test.server.runtime.CDK32RuntimeDetectionTest;
import org.jboss.tools.cdk.ui.bot.test.server.wizard.CDK32ServerWizardTest;
import org.jboss.tools.cdk.ui.bot.test.server.wizard.CDK3ServerWizardTest;
import org.jboss.tools.cdk.ui.bot.test.server.wizard.download.DownloadContainerRuntimeDefaultSettingsTest;
import org.jboss.tools.cdk.ui.bot.test.server.wizard.download.DownloadRuntimesWizardTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(RedDeerSuite.class)
@Suite.SuiteClasses({
	
	// UI integration tests
	
	// Runtime detection test after devstudio startup - must be first
	CDK32RuntimeDetectionDevstudioStartUpTest.class,
	//CDK3RuntimeDetectionTest.class,
	CDK32RuntimeDetectionTest.class,
	
	// Wizard tests by server adapter type
	CDK3ServerWizardTest.class,
	CDK32ServerWizardTest.class,
	
	// Downloading and installation of CDK/Minishift runtimes via new server wizard
	//CDK3DownloadRuntimeTest.class,
	//CDK32DownloadRuntimeTest.class,
	DownloadContainerRuntimeDefaultSettingsTest.class,
	DownloadRuntimesWizardTest.class,
	
	// Server editor tests by server adapter type
	CDK3ServerEditorTest.class,
	CDK32ServerEditorTest.class,
	CDKLaunchConfigurationTest.class,
	
	
	// Setup CDK context menu item tests
	CDKServerAdapterSetupCDKTest.class,
		
	// Integration tests dependent on CDK start up
	
	// Main integration test of devstudio and CDK, is using different profile for clear start
	// and registers cdk rhel image
	CDK32IntegrationTest.class,
	
	// Testing of Image registry URL discovery in OS connection 
	CDKImageRegistryUrlDiscoveryTest.class,
	CDKImageRegistryUrlDiscoveryFailureTest.class,
	CDKImageRegistryUrlValidatorTest.class,

	// Extended test case checking for error during CDK 3.2+ start up 
	// with no or wrong credentials passed into env.
	//CDKWrongCredentialsTest.class,
	
	// Integration test for creating/operating of CDK 3.2+ server adapter with multiple profiles set
	CDK32ServerAdapterProfilesTest.class
})
/**
 * @author ondrej dockal
 */
public class CDKAllTestsSuite {

}
