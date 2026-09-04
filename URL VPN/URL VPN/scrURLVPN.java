@echo off
:mine menu
title URL VPN
echo Welcome to URL VPN
echo.
echo version 1.0.6
echo _______________________________________________________________
echo 1. auto VPN setup
echo 2. stop
echo 3. protocol proxy set exec
echo 4. classic proxy
echo _______________________________________________________________
echo 5. check keyproxy
echo 6. check vps connections tls_clienthello_www_google_com
echo 7. server reboot
echo _______________________________________________________________
echo 8. ALT3 a2a09b
echo 9. ALT3 real240
echo 10. ALT3 HKLM
echo 11. ALT3 a2a190b
echo 12. ALT3 yoffset
echo 13. ALT3 HKCU
echo 14. ALT3 keyangle
echo 15. ALT3 n0
echo 16. ALT3 n2
echo 17. ALT3 n3
echo 18. ALT3 EXP
echo _______________________________________________________________
echo 19. ALT4 EXP 1
echo 20. ALT4 EXP 2
echo 21. ALT4 EXP 3
echo 22. ALT4 EXP 4
echo 23. ALT4 EXP 5
echo 24. ALT4 EXP 6
echo 25. ALT4 EXP 7
echo 26. ALT4 EXP 8
echo 27. ALT4 EXP 9
echo _______________________________________________________________
echo 28. bypassing the block .com 1
echo 29. bypassing the block .com 2
echo _______________________________________________________________
echo 30. VPN URL requirement
echo _______________________________________________________________
echo 0. exit
echo.
set /p var=Set Option:
if %var%==1 goto start VPN
if %var%==2 goto stop
if %var%==3 goto protocol proxy set exec
if %var%==4 goto classic proxy
if %var%==5 goto check keyproxy
if %var%==6 goto check vps connections tls_clienthello_www_google_com
if %var%==7 goto server reboot
if %var%==8 goto ALT3 a2a09b
if %var%==9 goto ALT3 real240
if %var%==10 goto ALT3 HKLM
if %var%==11 goto ALT3 a2a190b
if %var%==12 goto ALT3 yoffset
if %var%==13 goto ALT3 HKCU
if %var%==14 goto ALT3 keyangle
if %var%==15 goto ALT3 n0
if %var%==16 goto ALT3 n2
if %var%==17 goto ALT3 n3
if %var%==18 goto ALT3 EXP
if %var%==19 goto ALT4 EXP 1
if %var%==20 goto ALT4 EXP 2
if %var%==21 goto ALT4 EXP 3
if %var%==22 goto ALT4 EXP 4
if %var%==23 goto ALT4 EXP 5
if %var%==24 goto ALT4 EXP 6
if %var%==25 goto ALT4 EXP 7
if %var%==26 goto ALT4 EXP 8
if %var%==27 goto ALT4 EXP 9
if %var%==28 goto bypassing the block .com 1
if %var%==29 goto bypassing the block .com 2
if %var%==30 goto VPN URL requirement
if %var%==0 goto exit
:start VPN
cls
echo[System.File]
"%SystemRoot%\inf\nfssvr\$ [dsctrs.ini]"
"%SystemRoot%\system32\$ [nfsmgmt.msc]"
"%SystemRoot%\Diagnostics\* [*]"
"%ProgramData%\Microsoft\Windows\Start Menu\Programs\Windows Virtual PC [desktop.ini]"

[System.Registry]
"HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Schedule\TaskCache\Tree\Microsoft\Windows\Windows Activation Technologies\ValidationTask\* [*]"
"HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Schedule\TaskCache\Tree\Microsoft\Windows\Windows Activation Technologies\ValidationTaskDeadline\* [*]"

[System.GAC]
"[accessibility, version=2.0.*]"
"[aspnetmmcext, version=2.0.*]"
"[auditpolicygpmanagedstubs.interop, version=6.1.*]"
"[bdatunepia, version=6.1.*]"
"[blbmmc, version=6.1.*]"
"[blbmmc.resources, version=6.1.*]"
"[blbproxy, version=6.1.*]"
"[blbproxy.resources, version=6.1.*]"
"[blbwizfx, version=6.1.*]"
"[blbwizfx.resources, version=6.1.*]"
"[cfscommonuifx, version=1.0.*]"
"[cfscommonuifx.resources, version=1.0.*]"
"[comsvcconfig, version=3.0.*]"
"[cscompmgd, version=8.0.*]"
"[custommarshalers, version=2.0.*]"
"[dfsmgmt, version=1.0.*]"
"[dfsmgmt.resources, version=1.0.*]"
"[dfsobjectmodel, version=1.0.*]"
"[dfsobjectmodel.resources, version=1.0.*]"
"[dfsvc, version=2.0.*]"
"[ehcir, version=6.1.*]"
"[ehexthost, version=6.1.*]"
"[ehexthost32, version=6.1.*]"
"[ehiactivscp, version=6.1.*]"
"[ehibmldatacarousel, version=6.1.*]"
"[ehiextens, version=6.1.*]"
"[ehiitv, version=6.1.*]"
"[ehiproxy, version=6.1.*]"
"[ehitvmsmusic, version=6.1.*]"
"[ehiupnp, version=6.1.*]"
"[ehiuserxp, version=6.1.*]"
"[ehividctl, version=6.1.*]"
"[ehiwmp, version=6.1.*]"
"[ehiwuapi, version=6.1.*]"
"[ehrecobj, version=6.1.*]"
"[ehshell, version=6.1.*]"
"[eventviewer, version=6.1.*]"
"[eventviewer.resources, version=6.1.*]"
"[ieexecremote, version=2.0.*]"
"[iehost, version=2.0.*]"
"[iiehost, version=2.0.*]"
"[interop.dfsrhelper, version=1.0.*]"
"[isymwrapper, version=2.0.*]"
"[loadmxf, version=6.1.*]"
"[mcepg, version=6.1.*]"
"[mcesidebarctrl, version=6.1.*]"
"[mcglidhostobj, version=6.1.*]"
"[mcplayerinterop, version=6.1.*]"
"[mcstore, version=6.1.*]"
"[mcstoredb, version=6.1.*]"
"[mcupdate, version=6.1.*]"
"[mcx2dvcs, version=6.1.*]"
"[microsoft-windows-homegroupdiagnostic.netlistmgr.interop, version=6.1.*]"
"[microsoft.applicationid.framework, version=6.1.*]"
"[microsoft.applicationid.framework.resources, version=6.1.*]"
"[microsoft.applicationid.rulewizard, version=6.1.*]"
"[microsoft.applicationid.rulewizard.resources, version=6.1.*]"
"[microsoft.backgroundintelligenttransfer.management, version=1.0.*]"
"[microsoft.backgroundintelligenttransfer.management.resources, version=1.0.*]"
"[microsoft.bestpractices, version=6.1.*]"
"[microsoft.bestpractices.resources, version=6.1.*]"
"[microsoft.build.conversion.v3.5, version=3.5.*]"
"[microsoft.build.engine, version=2.0.*]"
"[microsoft.build.engine, version=3.5.*]"
"[microsoft.build.framework, version=2.0.*]"
"[microsoft.build.framework, version=3.5.*]"
"[microsoft.build.tasks, version=2.0.*]"
"[microsoft.build.tasks.v3.5, version=3.5.*]"
"[microsoft.build.utilities, version=2.0.*]"
"[microsoft.build.utilities.v3.5, version=3.5.*]"
"[microsoft.certificateservices.setup.interop, version=6.0.*]"
"[microsoft.grouppolicy.admtmpleditor, version=6.1.*]"
"[microsoft.grouppolicy.admtmpleditor.resources, version=6.1.*]"
"[microsoft.grouppolicy.interop, version=2.0.*]"
"[microsoft.grouppolicy.reporting, version=2.0.*]"
"[microsoft.grouppolicy.reporting.resources, version=2.0.*]"
"[microsoft.iis.powershell.framework, version=7.5.*]"
"[microsoft.iis.powershell.framework.resources, version=7.5.*]"
"[microsoft.iis.powershell.provider, version=7.5.*]"
"[microsoft.iis.powershell.provider.resources, version=7.5.*]"
"[microsoft.ink, version=1.0.*]"
"[microsoft.ink, version=1.7.*]"
"[microsoft.ink, version=6.1.*]"
"[microsoft.ink.resources, version=6.1.*]"
"[microsoft.interop.security.azroles, version=2.0.*]"
"[microsoft.jscript, version=8.0.*]"
"[microsoft.managementconsole, version=3.0.*]"
"[microsoft.managementconsole.resources, version=3.0.*]"
"[microsoft.mediacenter, version=6.1.*]"
"[microsoft.mediacenter.bml, version=6.1.*]"
"[microsoft.mediacenter.interop, version=6.1.*]"
"[microsoft.mediacenter.itv, version=6.1.*]"
"[microsoft.mediacenter.itv.hosting, version=6.1.*]"
"[microsoft.mediacenter.itv.media, version=6.1.*]"
"[microsoft.mediacenter.itvvm, version=6.1.*]"
"[microsoft.mediacenter.mheg, version=6.1.*]"
"[microsoft.mediacenter.playback, version=6.1.*]"
"[microsoft.mediacenter.shell, version=6.1.*]"
"[microsoft.mediacenter.sports, version=6.1.*]"
"[microsoft.mediacenter.tv.tuners.interop, version=6.1.*]"
"[microsoft.mediacenter.ui, version=6.1.*]"
"[microsoft.powershell.commands.diagnostics, version=1.0.*]"
"[microsoft.powershell.commands.diagnostics.resources, version=1.0.*]"
"[microsoft.powershell.commands.management, version=1.0.*]"
"[microsoft.powershell.commands.management.resources, version=1.0.*]"
"[microsoft.powershell.commands.utility, version=1.0.*]"
"[microsoft.powershell.commands.utility.resources, version=1.0.*]"
"[microsoft.powershell.consolehost, version=1.0.*]"
"[microsoft.powershell.consolehost.resources, version=1.0.*]"
"[microsoft.powershell.editor, version=1.0.*]"
"[microsoft.powershell.editor.resources, version=1.0.*]"
"[microsoft.powershell.gpowershell, version=1.0.*]"
"[microsoft.powershell.gpowershell.resources, version=1.0.*]"
"[microsoft.powershell.graphicalhost, version=1.0.*]"
"[microsoft.powershell.graphicalhost.resources, version=1.0.*]"
"[microsoft.powershell.security, version=1.0.*]"
"[microsoft.powershell.security.resources, version=1.0.*]"
"[microsoft.security.applicationid.policymanagement.cmdlets, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.cmdlets.resources, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.policyengineapi.interop, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.policymanager, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.policymanager.resources, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.policymodel, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.policymodel.resources, version=6.1.*]"
"[microsoft.security.applicationid.policymanagement.xmlhelper, version=6.1.*]"
"[microsoft.security.applicationid.wizards.automaticrulegenerationwizard, version=6.1.*]"
"[microsoft.security.applicationid.wizards.automaticrulegenerationwizard.resources, version=6.1.*]"
"[microsoft.storage.nfscommon, version=1.0.*]"
"[microsoft.storage.nfscommon.resources, version=1.0.*]"
"[microsoft.storage.nfsobjectmodel, version=1.0.*]"
"[microsoft.storage.nfsobjectmodel.resources, version=1.0.*]"
"[microsoft.storage.sancommon, version=1.0.*]"
"[microsoft.storage.sancommon.resources, version=1.0.*]"
"[microsoft.storage.sancommon.ui, version=1.0.*]"
"[microsoft.storage.sancommon.ui.resources, version=1.0.*]"
"[microsoft.storage.vds, version=1.0.*]"
"[microsoft.storage.vds.resources, version=1.0.*]"
"[microsoft.tpm, version=6.1.*]"
"[microsoft.tpm.resources, version=6.1.*]"
"[microsoft.transactions.bridge, version=3.0.*]"
"[microsoft.transactions.bridge.dtc, version=3.0.*]"
"[microsoft.visualbasic, version=8.0.*]"
"[microsoft.visualbasic.compatibility, version=8.0.*]"
"[microsoft.visualbasic.compatibility.data, version=8.0.*]"
"[microsoft.visualbasic.vsa, version=8.0.*]"
"[microsoft.visualc, version=8.0.*]"
"[microsoft.visualc.stlclr, version=1.0.*]"
"[microsoft.vsa, version=8.0.*]"
"[microsoft.vsa.vb.codedomprocessor, version=8.0.*]"
"[microsoft.web.administration, version=7.0.*]"
"[microsoft.web.administration.resources, version=7.0.*]"
"[microsoft.web.management, version=7.0.*]"
"[microsoft.web.management.aspnet, version=7.5.*]"
"[microsoft.web.management.aspnet.resources, version=7.5.*]"
"[microsoft.web.management.aspnetclient, version=7.5.*]"
"[microsoft.web.management.aspnetclient.resources, version=7.5.*]"
"[microsoft.web.management.ftp, version=7.5.*]"
"[microsoft.web.management.ftp.resources, version=7.5.*]"
"[microsoft.web.management.ftpclient, version=7.5.*]"
"[microsoft.web.management.ftpclient.resources, version=7.5.*]"
"[microsoft.web.management.iis, version=7.5.*]"
"[microsoft.web.management.iis.resources, version=7.5.*]"
"[microsoft.web.management.iisclient, version=7.5.*]"
"[microsoft.web.management.iisclient.resources, version=7.5.*]"
"[microsoft.web.management.remoting, version=7.0.*]"
"[microsoft.web.management.remoting.resources, version=7.0.*]"
"[microsoft.web.management.resources, version=7.0.*]"
"[microsoft.web.management.webdav, version=7.5.*]"
"[microsoft.web.management.webdav.resources, version=7.5.*]"
"[microsoft.web.management.webdavclient, version=7.5.*]"
"[microsoft.web.management.webdavclient.resources, version=7.5.*]"
"[microsoft.windows.diagnosis.commands.getdiaginput, version=6.1.*]"
"[microsoft.windows.diagnosis.commands.getdiaginput.resources, version=1.0.*]"
"[microsoft.windows.diagnosis.commands.updatediagreport, version=6.1.*]"
"[microsoft.windows.diagnosis.commands.updatediagreport.resources, version=1.0.*]"
"[microsoft.windows.diagnosis.commands.updatediagrootcause, version=6.1.*]"
"[microsoft.windows.diagnosis.commands.updatediagrootcause.resources, version=1.0.*]"
"[microsoft.windows.diagnosis.commands.writediagprogress, version=6.1.*]"
"[microsoft.windows.diagnosis.commands.writediagprogress.resources, version=1.0.*]"
"[microsoft.windows.diagnosis.sdengine, version=6.1.*]"
"[microsoft.windows.diagnosis.sdhost, version=6.1.*]"
"[microsoft.windows.diagnosis.sdhost.resources, version=1.0.*]"
"[microsoft.windows.diagnosis.troubleshootingpack, version=6.1.*]"
"[microsoft.windows.diagnosis.troubleshootingpack.resources, version=6.1.*]"
"[microsoft.windows.servermanager, version=6.1.*]"
"[microsoft.windows.servermanager.powershell, version=6.1.*]"
"[microsoft.windows.servermanager.powershell.resources, version=6.1.*]"
"[microsoft.windows.servermanager.resources, version=6.1.*]"
"[microsoft.wsman.management, version=1.0.*]"
"[microsoft.wsman.management.resources, version=1.0.*]"
"[microsoft.wsman.runtime, version=1.0.*]"
"[microsoft_vsavb, version=8.0.*]"
"[miguicontrols, version=1.0.*]"
"[miguicontrols.resources, version=1.0.*]"
"[mmcex, version=3.0.*]"
"[mmcex.resources, version=3.0.*]"
"[mmcfxcommon, version=3.0.*]"
"[mmcfxcommon.resources, version=3.0.*]"
"[msbuild, version=3.5.*]"
"[mscorlib, version=2.0.*]"
"[napcrypt, version=6.1.*]"
"[naphlpr, version=6.1.*]"
"[napinit, version=6.1.*]"
"[napinit.resources, version=6.1.*]"
"[napsnap, version=6.1.*]"
"[napsnap.resources, version=6.1.*]"
"[narrator, version=6.1.*]"
"[nfsconfigguide, version=1.0.*]"
"[nfsconfigguide.resources, version=1.0.*]"
"[policy.1.0.microsoft.ink, version=6.1.*]"
"[policy.1.0.microsoft.interop.security.azroles, version=6.1.*]"
"[policy.1.2.microsoft.interop.security.azroles, version=6.1.*]"
"[policy.1.7.microsoft.ink, version=6.1.*]"
"[policy.6.0.microsoft.ink, version=6.1.*]"
"[presentationbuildtasks, version=3.0.*]"
"[presentationcffrasterizer, version=3.0.*]"
"[presentationcore, version=3.0.*]"
"[presentationfontcache, version=3.0.*]"
"[presentationframework, version=3.0.*]"
"[presentationframework.aero, version=3.0.*]"
"[presentationframework.classic, version=3.0.*]"
"[presentationframework.luna, version=3.0.*]"
"[presentationframework.royale, version=3.0.*]"
"[presentationui, version=3.0.*]"
"[reachframework, version=3.0.*]"
"[rmconfighelper, version=6.1.*]"
"[rmconfighelper.resources, version=6.1.*]"
"[securityauditpoliciessnapin, version=6.1.*]"
"[securityauditpoliciessnapin.resources, version=6.1.*]"
"[sentinel.v3.5client, version=3.5.*]"
"[servermanagercmd.resources, version=6.1.*]"
"[setupnfsidmap, version=1.0.*]"
"[smdiagnostics, version=3.0.*]"
"[smsvchost, version=3.0.*]"
"[sonicmceburnengine, version=6.1.*]"
"[srmlib, version=1.0.*]"
"[srpuxsnapin, version=6.1.*]"
"[srpuxsnapin.resources, version=6.1.*]"
"[storagemgmt, version=1.0.*]"
"[storagemgmt.resources, version=1.0.*]"
"[sysglobl, version=2.0.*]"
"[system, version=2.0.*]"
"[system.addin, version=3.5.*]"
"[system.addin.contract, version=2.0.*]"
"[system.componentmodel.dataannotations, version=3.5.*]"
"[system.configuration, version=2.0.*]"
"[system.configuration.install, version=2.0.*]"
"[system.core, version=3.5.*]"
"[system.data, version=2.0.*]"
"[system.data.datasetextensions, version=3.5.*]"
"[system.data.entity, version=3.5.*]"
"[system.data.entity.design, version=3.5.*]"
"[system.data.linq, version=3.5.*]"
"[system.data.oracleclient, version=2.0.*]"
"[system.data.services, version=3.5.*]"
"[system.data.services.client, version=3.5.*]"
"[system.data.services.design, version=3.5.*]"
"[system.data.sqlxml, version=2.0.*]"
"[system.deployment, version=2.0.*]"
"[system.design, version=2.0.*]"
"[system.directoryservices, version=2.0.*]"
"[system.directoryservices.accountmanagement, version=3.5.*]"
"[system.directoryservices.protocols, version=2.0.*]"
"[system.drawing, version=2.0.*]"
"[system.drawing.design, version=2.0.*]"
"[system.enterpriseservices, version=2.0.*]"
"[system.identitymodel, version=3.0.*]"
"[system.identitymodel.selectors, version=3.0.*]"
"[system.io.log, version=3.0.*]"
"[system.management, version=2.0.*]"
"[system.management.automation, version=1.0.*]"
"[system.management.automation.resources, version=1.0.*]"
"[system.management.instrumentation, version=3.5.*]"
"[system.messaging, version=2.0.*]"
"[system.net, version=3.5.*]"
"[system.printing, version=3.0.*]"
"[system.runtime.remoting, version=2.0.*]"
"[system.runtime.serialization, version=3.0.*]"
"[system.runtime.serialization.formatters.soap, version=2.0.*]"
"[system.security, version=2.0.*]"
"[system.servicemodel, version=3.0.*]"
"[system.servicemodel.install, version=3.0.*]"
"[system.servicemodel.washosting, version=3.0.*]"
"[system.servicemodel.web, version=3.5.*]"
"[system.serviceprocess, version=2.0.*]"
"[system.speech, version=3.0.*]"
"[system.transactions, version=2.0.*]"
"[system.web, version=2.0.*]"
"[system.web.abstractions, version=3.5.*]"
"[system.web.dynamicdata, version=3.5.*]"
"[system.web.dynamicdata.design, version=3.5.*]"
"[system.web.entity, version=3.5.*]"
"[system.web.entity.design, version=3.5.*]"
"[system.web.extensions, version=3.5.*]"
"[system.web.extensions.design, version=3.5.*]"
"[system.web.mobile, version=2.0.*]"
"[system.web.regularexpressions, version=2.0.*]"
"[system.web.routing, version=3.5.*]"
"[system.web.services, version=2.0.*]"
"[system.windows.forms, version=2.0.*]"
"[system.windows.presentation, version=3.5.*]"
"[system.workflow.activities, version=3.0.*]"
"[system.workflow.componentmodel, version=3.0.*]"
"[system.workflow.runtime, version=3.0.*]"
"[system.workflowservices, version=3.5.*]"
"[system.xml, version=2.0.*]"
"[system.xml.linq, version=3.5.*]"
"[taskscheduler, version=6.1.*]"
"[taskscheduler.resources, version=6.1.*]"
"[uiautomationclient, version=3.0.*]"
"[uiautomationclientsideproviders, version=3.0.*]"
"[uiautomationprovider, version=3.0.*]"
"[uiautomationtypes, version=3.0.*]"
"[windowsbase, version=3.0.*]"
"[windowsformsintegration, version=3.0.*]"
"[wsatconfig, version=3.0.*]"

[User.File]
"%AppData%\Microsoft\Search\* [*]"
"%CSIDL_SENDTO% [compressed (zipped) folder.zfsendtotarget]"
"%CSIDL_SENDTO% [desktop (create shortcut).desklink]"
"%CSIDL_SENDTO% [desktop.ini]"
"%CSIDL_SENDTO% [fax recipient.lnk]"
"%CSIDL_SENDTO% [mail recipient.mapimail]"
"%CSIDL_PROGRAMS%\accessories\accessibility [desktop.ini]"
"%CSIDL_PROGRAMS%\accessories\accessibility [ease of access.lnk]"
"%CSIDL_PROGRAMS%\accessories\accessibility [magnify.lnk]"
"%CSIDL_PROGRAMS%\accessories\accessibility [narrator.lnk]"
"%CSIDL_PROGRAMS%\accessories\accessibility [on-screen keyboard.lnk]"
"%CSIDL_PROGRAMS%\accessories\accessibility [utility manager.lnk]"
"%CSIDL_PROGRAMS%\accessories\communications [desktop.ini]"
"%CSIDL_PROGRAMS%\accessories\communications [network connections.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [computer.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [control panel.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [desktop.ini]"
"%CSIDL_PROGRAMS%\accessories\system tools [lock.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [log off.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [msdt.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [power.lnk]"
"%CSIDL_PROGRAMS%\accessories\system tools [show desktop.lnk]"
"%CSIDL_PROGRAMS%\accessories [desktop.ini]"
"%CSIDL_PROGRAMS%\accessories [help.lnk]"
"%CSIDL_PROGRAMS%\accessories [notepad.lnk]"
"%CSIDL_PROGRAMS%\accessories [run.lnk]"
"%CSIDL_PROGRAMS%\accessories [synchronize.lnk]"
"%CSIDL_PROGRAMS%\accessories [windows explorer.lnk]"
"%CSIDL_PROGRAMS%\maintenance [help.lnk]"
"%CSIDL_PROGRAMS%\system tools [help.lnk]"
"%CSIDL_PROGRAMS% [desktop.ini]"
"%CSIDL_PROGRAMS% [set program access and defaults.lnk]"
"%CSIDL_PROGRAMS% [turn uap settings on or off.lnk]"
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%
pause
exit
:stop
cls
echo vpn is off CODE(--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --stop ^)
pause
exit
:protocol proxy set exec 
cls
echo exclude %~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=hostfakesplit --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun2.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n3
pause
exit
:classic proxy
cls
echo[System.File]
"%SystemRoot%\inf\nfssvr\$ [dsctrs.ini]"
"%SystemRoot%\system32\$ [nfsmgmt.msc]"
"%SystemRoot%\Diagnostics\* [*]"
"%ProgramData%\Microsoft\Windows\Start Menu\Programs\Windows Virtual PC [desktop.ini]"
[User.Registry]
"HKCU\Software\Microsoft\Windows\CurrentVersion\Run [Windows Media Center]"
BytesWarning BOOT SyntaxWarning with Warning enumerate quit
setup bin (BIOS) set exec
setattr StopAsyncIteration System
set setattr elif UEFI exec SyntaxWarning'SyntaxWarning







({
  "_type": "export",
  "__export_format": 4,
  "__export_date": "2026-05-24T21:38:51.271Z",
  "__export_source": "NativeRest:v2.2.0",
  "resources": [
    {
      "_id": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281693,
      "created": 1776375281693,
      "name": "adb.exe",
      "description": "",
      "scope": "collection",
      "_type": "workspace"
    },
    {
      "_id": "env_a6dc5e167f2a46b6bba55cf4f4df8032",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281693,
      "created": 1776375281693,
      "name": "Base Environment", 
      "isPrivate": false,
      "metaSortKey": 1776375281693,
      "_type": "environment"
    },
    {
      "_id": "req_41a881ed232f43729f427c16cba72069",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776380752102,
      "created": 1776380752102,
      "url": "??xml version=1.0 encoding=UTF-8?&!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd&plist version=1.0&dict&keyangle/key&real90/real&keyangleVariance/key&real45/real&keyblendFuncDestination/key&integer1/integer&keyblendFuncSource/key&integer770/integer&keyduration/key&real-1/real&keyemitterType/key&real0.0/real&keyfinishColorAlpha/key&real1/real&keyfinishColorBlue/key&real0.0/real&keyfinishColorGreen/key&real0.0/real&keyfinishColorRed/key&real0.0/real&keyfinishColorVarianceAlpha/key&real0.0/real&keyfinishColorVarianceBlue/key&real0.0/real&keyfinishColorVarianceGreen/key&real0.0/real&keyfinishColorVarianceRed/key&real0.0/real&keyfinishParticleSize/key&real0.0/real&keyfinishParticleSizeVariance/key&real0.0/real&keygravityx/key&real0.0/real&keygravityy/key&real0.0/real&keymaxParticles/key&real50/real&keymaxRadius/key&real100/real&keymaxRadiusVariance/key&real0.0/real&keyminRadius/ke&real0.0/real&keyparticleLifespan/key&real0.0/real&keyparticleLifespanVariance/key&real1.5/real&keyradialAccelVariance/key&real0.0/real&keyradialAcceleration/key&real0.0/real&keyrotatePerSecond/key&real0.0/real&keyrotatePerSecondVariance/key&real0.0/real&keyrotationEnd/key&real0.0/real&keyrotationEndVariance/key&real0.0/real&keyrotationStart/key&real0.0/real&keyrotationStartVariance/key&real0.0/real&keysourcePositionVariancex/key&real46/real&keysourcePositionVariancey/key&real0.0/real&keysourcePositionx/key&real240.65878295898438/real&keysourcePositiony/key&real162.94760131835938/real&keyspeed/key&real40/real&keyspeedVariance/key&real15/real&keystartColorAlpha/key&real0.5/real&keystartColorBlue/key&real1/real&keystartColorGreen/key&real1/real&keystartColorRed/key&real1/real&keystartColorVarianceAlpha/key&real0.5/real&keystartColorVarianceBlue/key&real0.10000000149011612/real&keystartColorVarianceGreen/key&real0.10000000149011612/real&keystartColorVarianceRed/key&real0.10000000149011612/real&keystartParticleSize/key&real4/real&keystartParticleSizeVariance/key&real1/real&keytangentialAccelVariance/key&real0.0/real&keytangentialAcceleration/key&real0.0/real&keytextureFileName/key&stringsquare.png/string&/dict&/plist",
      "name": "2",
      "description": "",
      "method": "GET",
      "body": {
        "mimeType": "text/html",
        "text": ""
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "Content-Type",
          "value": "text/html"
        }
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776380752102,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_6bbaef6deead48778724e49f47e874ba",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776382073997,
      "created": 1776382073997,
      "url": "??xml version=1.0 encoding=UTF-8??xml version = 1.0 encoding=UTF-8??xml version = 1.0 encoding=UTF-8?&!DOCTYPE plist PUBLIC -//Apple Computer//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd&plist version=1.0&dict&keyframes/key&dict&keycolourPicker.png/key&dict&keyframe/key&string{{176,1},{13,13}}/string&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{13,13}}/string&string{13,13}/string&/dict&keycolourPickerBackground.png/key&dict&keyframe/key&string{{1,461},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerOverlay.png/key&dict&keyframe/key&string{{85,319},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerShadow.png/key&dict&keyframe/key&string{{112,430},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keyhueBar.png/key&dict&keyframe/key&keyframe/key&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&string{20,292}/string&/dict&keyhuePickerBackground.png/key&dict&keyframe/key&string{{85,168},{150,150}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{150,150}}/string&/dict&keylightnessBar.png/key&dict&keyframe/key&string{{22,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keysaturationBarBottom.png/key&dict&keyframe/key&string{{43,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keysaturationBarTop.png/key&dict&keyframe/key&string{{64,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&/dict&keymetadata/key&dict&keyformat/key&integer2/integer&keyrealTextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&keysize/key&string{236,572}/string&keysmartupdate/key&string$TexturePacker:SmartUpdate:daa2656ba65391e1afccbc64ef4ed72f:d071bcbdaa932f2d637c8cec8d9f7fa2:0dfe3216bd36d3c9fec1891e9c7a586f$/string&keytextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&/dict&/dict&/plist&!DOCTYPE plist PUBLIC -//Apple Computer//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd&plist version=1.0&dict&keyframes/key&dict&keycolourPicker.png/key&dict&keyframe/key&string{{176,1},{13,13}}/string&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{13,13}}/string&string{13,13}/string&/dict&keycolourPickerBackground.png/key&dict&keyframe/key&string{{1,461},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerOverlay.png/key&dict&keyframe/key&string{{85,319},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerShadow.png/key&dict&keyframe/key&string{{112,430},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keyhueBar.png/key&dict&keyframe/key&keyframe/key&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&string{20,292}/string&/dict&keyhuePickerBackground.png/key&dict&keyframe/key&string{{85,168},{150,150}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{150,150}}/string&/dict&keylightnessBar.png/key&dict&keyframe/key&string{{22,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keysaturationBarBottom.png/key&dict&keyframe/key&string{{43,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keysaturationBarTop.png/key&dict&keyframe/key&string{{64,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&/dict&keymetadata/key&dict&keyformat/key&integer2/integer&keyrealTextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&keysize/key&string{236,572}/string&keysmartupdate/key&string$TexturePacker:SmartUpdate:daa2656ba65391e1afccbc64ef4ed72f:d071bcbdaa932f2d637c8cec8d9f7fa2:0dfe3216bd36d3c9fec1891e9c7a586f$/string&keytextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&/dict&/dict&/plist&!DOCTYPE plist PUBLIC -//Apple Computer//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd&plist version=1.0&dict&keyframes/key&dict&keycolourPicker.png/key&dict&keyframe/key&string{{176,1},{13,13}}/string&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{13,13}}/string&string{13,13}/string&/dict&keycolourPickerBackground.png/key&dict&keyframe/key&string{{1,461},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerOverlay.png/key&dict&keyframe/key&string{{85,319},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerShadow.png/key&dict&keyframe/key&string{{112,430},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keyhueBar.png/key&dict&keyframe/key&keyframe/key&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&string{20,292}/string&/dict&keyhuePickerBackground.png/key&dict&keyframe/key&string{{85,168},{150,150}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{150,150}}/string&/dict&keylightnessBar.png/key&dict&keyframe/key&string{{22,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keysaturationBarBottom.png/key&dict&keyframe/key&string{{43,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keysaturationBarTop.png/key&dict&keyframe/key&string{{64,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&/dict&keymetadata/key&dict&keyformat/key&integer2/integer&keyrealTextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&keysize/key&string{236,572}/string&keysmartupdate/key&string$TexturePacker:SmartUpdate:daa2656ba65391e1afccbc64ef4ed72f:d071bcbdaa932f2d637c8cec8d9f7fa2:0dfe3216bd36d3c9fec1891e9c7a586f$/string&keytextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&/dict&/dict&/plist",
      "name": "New Request 3",
      "description": "",
      "method": "GET",
      "body": {
        "mimeType": "application/xml",
        "text": "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\r\n<plist version=\"1.0\">\r\n<dict>\r\n    <key>angle</key>\r\n    <real>0</real>\r\n    <key>angleVariance</key>\r\n    <real>95</real>\r\n    <key>blendFuncDestination</key>\r\n    <integer>1</integer>\r\n    <key>blendFuncSource</key>\r\n    <integer>770</integer>\r\n    <key>duration</key>\r\n    <real>-1</real>\r\n    <key>emitterType</key>\r\n    <real>1</real>\r\n    <key>finishColorAlpha</key>\r\n    <real>1</real>\r\n    <key>finishColorBlue</key>\r\n    <real>1</real>\r\n    <key>finishColorGreen</key>\r\n    <real>1</real>\r\n    <key>finishColorRed</key>\r\n    <real>1</real>\r\n    <key>finishColorVarianceAlpha</key>\r\n    <real>0</real>\r\n    <key>finishColorVarianceBlue</key>\r\n    <real>0</real>\r\n    <key>finishColorVarianceGreen</key>\r\n    <real>0</real>\r\n    <key>finishColorVarianceRed</key>\r\n    <real>0</real>\r\n    <key>finishParticleSize</key>\r\n    <real>1</real>\r\n    <key>finishParticleSizeVariance</key>\r\n    <real>0</real>\r\n    <key>gravityx</key>\r\n    <real>0</real>\r\n    <key>gravityy</key>\r\n    <real>-300</real>\r\n    <key>maxParticles</key>\r\n    <real>100</real>\r\n    <key>maxRadius</key>\r\n    <real>120</real>\r\n    <key>maxRadiusVariance</key>\r\n    <real>40</real>\r\n    <key>minRadius</key>\r\n    <integer>10</integer>\r\n    <key>particleLifespan</key>\r\n    <real>0.600000023841858</real>\r\n    <key>particleLifespanVariance</key>\r\n    <real>0.4000000059604645</real>\r\n    <key>radialAccelVariance</key>\r\n    <real>0</real>\r\n    <key>radialAcceleration</key>\r\n    <real>0</real>\r\n    <key>rotatePerSecond</key>\r\n    <real>0</real>\r\n    <key>rotatePerSecondVariance</key>\r\n    <real>0</real>\r\n    <key>rotationEnd</key>\r\n    <real>0</real>\r\n    <key>rotationEndVariance</key>\r\n    <real>0</real>\r\n    <key>rotationStart</key>\r\n    <real>0</real>\r\n    <key>rotationStartVariance</key>\r\n    <real>0</real>\r\n    <key>sourcePositionVariancex</key>\r\n    <real>3</real>\r\n    <key>sourcePositionVariancey</key>\r\n    <real>5</real>\r\n    <key>sourcePositionx</key>\r\n    <real>454.55517578125</real>\r\n    <key>sourcePositiony</key>\r\n    <real>177.2761993408203</real>\r\n    <key>speed</key>\r\n    <real>75</real>\r\n    <key>speedVariance</key>\r\n    <real>20</real>\r\n    <key>startColorAlpha</key>\r\n    <real>0.5</real>\r\n    <key>startColorBlue</key>\r\n    <real>1</real>\r\n    <key>startColorGreen</key>\r\n    <real>1</real>\r\n    <key>startColorRed</key>\r\n    <real>1</real>\r\n    <key>startColorVarianceAlpha</key>\r\n    <real>0</real>\r\n    <key>startColorVarianceBlue</key>\r\n    <real>0</real>\r\n    <key>startColorVarianceGreen</key>\r\n    <real>0</real>\r\n    <key>startColorVarianceRed</key>\r\n    <real>0</real>\r\n    <key>startParticleSize</key>\r\n    <real>6</real>\r\n    <key>startParticleSizeVariance</key>\r\n    <real>2</real>\r\n    <key>tangentialAccelVariance</key>\r\n    <real>0</real>\r\n    <key>tangentialAcceleration</key>\r\n    <real>0</real>\r\n    <key>textureFileName</key>\r\n    <string>square.png</string>\r\n</dict>\r\n</plist>\r\n  }\r\n } \r\n}\r\ninfo face=\"Pusab\" size=128 bold=0 italic=0 charset=\"\" unicode=0 stretchH=100 smooth=1 aa=1 padding=0,0,0,0 spacing=1,1\r\ncommon lineHeight=130 base=78 scaleW=1024 scaleH=1024 pages=1 packed=0\r\npage id=0 file=\"bigFont-uhd.png\"\r\nchars count=96\r\nchar id=32     x=438   y=838   width=0     height=0     xoffset=0     yoffset=126   xadvance=60    page=0 chnl=0 letter=\"space\"\r\nchar id=33     x=102   y=132   width=62    height=107   xoffset=-0    yoffset=23    xadvance=48    page=0 chnl=0 letter=\"!\"\r\nchar id=34     x=90    y=838   width=69    height=51    xoffset=-0    yoffset=7     xadvance=54    page=0 chnl=0 letter=\"\"\"\r\nchar id=35     x=535   y=745   width=108   height=63    xoffset=-0    yoffset=22    xadvance=93    page=0 chnl=0 letter=\"#\"\r\nchar id=36     x=348   y=1     width=100   height=125   xoffset=-0    yoffset=11    xadvance=85    page=0 chnl=0 letter=\"$\"\r\nchar id=37     x=718   y=1     width=122   height=110   xoffset=-0    yoffset=19    xadvance=107   page=0 chnl=0 letter=\"%\"\r\nchar id=38     x=1     y=240   width=108   height=105   xoffset=-0    yoffset=22    xadvance=94    page=0 chnl=0 letter=\"&\"\r\nchar id=39     x=160   y=838   width=42    height=51    xoffset=-0    yoffset=7     xadvance=28    page=0 chnl=0 letter=\"'\"\r\nchar id=40     x=236   y=1     width=55    height=129   xoffset=-0    yoffset=9     xadvance=41    page=0 chnl=0 letter=\"(\"\r\nchar id=41     x=292   y=1     width=55    height=129   xoffset=-0    yoffset=9     xadvance=41    page=0 chnl=0 letter=\")\"\r\nchar id=42     x=813   y=745   width=56    height=54    xoffset=0     yoffset=5     xadvance=42    page=0 chnl=0 letter=\"*\"\r\nchar id=43     x=314   y=745   width=78    height=78    xoffset=-0    yoffset=41    xadvance=64    page=0 chnl=0 letter=\"+\"\r\nchar id=44     x=766   y=745   width=46    height=55    xoffset=-0    yoffset=82    xadvance=31    page=0 chnl=0 letter=\",\"\r\nchar id=45     x=326   y=838   width=66    height=40    xoffset=-0    yoffset=60    xadvance=51    page=0 chnl=0 letter=\"-\"\r\nchar id=46     x=203   y=838   width=43    height=43    xoffset=-0    yoffset=85    xadvance=29    page=0 chnl=0 letter=\".\"\r\nchar id=47     x=937   y=1     width=66    height=108   xoffset=0     yoffset=21    xadvance=53    page=0 chnl=0 letter=\"/\"\r\nchar id=48     x=688   y=132   width=98    height=106   xoffset=-0    yoffset=22    xadvance=84    page=0 chnl=0 letter=\"0\"\r\nchar id=49     x=780   y=450   width=81    height=103   xoffset=-0    yoffset=24    xadvance=66    page=0 chnl=0 letter=\"1\"\r\nchar id=50     x=735   y=240   width=97    height=104   xoffset=-0    yoffset=23    xadvance=83    page=0 chnl=0 letter=\"2\"\r\nchar id=51     x=787   y=132   width=97    height=106   xoffset=-0    yoffset=22    xadvance=82    page=0 chnl=0 letter=\"3\"\r\nchar id=52     x=225   y=346   width=108   height=103   xoffset=-0    yoffset=24    xadvance=94    page=0 chnl=0 letter=\"4\"\r\nchar id=53     x=110   y=240   width=94    height=105   xoffset=-0    yoffset=22    xadvance=80    page=0 chnl=0 letter=\"5\"\r\nchar id=54     x=488   y=132   width=99    height=106   xoffset=-0    yoffset=22    xadvance=85    page=0 chnl=0 letter=\"6\"\r\nchar id=55     x=304   y=450   width=96    height=103   xoffset=-0    yoffset=24    xadvance=82    page=0 chnl=0 letter=\"7\"\r\nchar id=56     x=205   y=240   width=92    height=105   xoffset=-0    yoffset=23    xadvance=78    page=0 chnl=0 letter=\"8\"\r\nchar id=57     x=588   y=132   width=99    height=106   xoffset=-0    yoffset=22    xadvance=84    page=0 chnl=0 letter=\"9\"\r\nchar id=58     x=382   y=554   width=46    height=95    xoffset=-0    yoffset=33    xadvance=31    page=0 chnl=0 letter=\":\"\r\nchar id=59     x=909   y=240   width=46    height=104   xoffset=-0    yoffset=33    xadvance=31    page=0 chnl=0 letter=\";\"\r\nchar id=60     x=393   y=745   width=70    height=75    xoffset=-0    yoffset=43    xadvance=55    page=0 chnl=0 letter=\"<\"\r\nchar id=61     x=703   y=745   width=62    height=56    xoffset=-0    yoffset=52    xadvance=47    page=0 chnl=0 letter=\"=\"\r\nchar id=62     x=464   y=745   width=70    height=75    xoffset=-0    yoffset=43    xadvance=55    page=0 chnl=0 letter=\">\"\r\nchar id=63     x=841   y=1     width=95    height=108   xoffset=-0    yoffset=22    xadvance=81    page=0 chnl=0 letter=\"?\"\r\nchar id=64     x=490   y=1     width=118   height=122   xoffset=-0    yoffset=13    xadvance=103   page=0 chnl=0 letter=\"@\"\r\nchar id=65     x=413   y=240   width=109   height=104   xoffset=-0    yoffset=23    xadvance=95    page=0 chnl=0 letter=\"A\"\r\nchar id=66     x=863   y=346   width=101   height=103   xoffset=-0    yoffset=24    xadvance=87    page=0 chnl=0 letter=\"B\"\r\nchar id=67     x=274   y=132   width=106   height=106   xoffset=-0    yoffset=22    xadvance=92    page=0 chnl=0 letter=\"C\"\r\nchar id=68     x=103   y=450   width=100   height=103   xoffset=-0    yoffset=24    xadvance=85    page=0 chnl=0 letter=\"D\"\r\nchar id=69     x=401   y=450   width=95    height=103   xoffset=-0    yoffset=24    xadvance=81    page=0 chnl=0 letter=\"E\"\r\nchar id=70     x=593   y=450   width=94    height=103   xoffset=-0    yoffset=24    xadvance=80    page=0 chnl=0 letter=\"F\"\r\nchar id=71     x=381   y=132   width=106   height=106   xoffset=-0    yoffset=22    xadvance=91    page=0 chnl=0 letter=\"G\"\r\nchar id=72     x=116   y=346   width=108   height=103   xoffset=-0    yoffset=24    xadvance=93    page=0 chnl=0 letter=\"H\"\r\nchar id=73     x=862   y=450   width=62    height=103   xoffset=-0    yoffset=24    xadvance=47    page=0 chnl=0 letter=\"I\"\r\nchar id=74     x=833   y=240   width=75    height=104   xoffset=-0    yoffset=24    xadvance=60    page=0 chnl=0 letter=\"J\"\r\nchar id=75     x=759   y=346   width=103   height=103   xoffset=-0    yoffset=24    xadvance=89    page=0 chnl=0 letter=\"K\"\r\nchar id=76     x=688   y=450   width=91    height=103   xoffset=-0    yoffset=24    xadvance=77    page=0 chnl=0 letter=\"L\"\r\nchar id=77     x=1     y=346   width=114   height=103   xoffset=-0    yoffset=24    xadvance=100   page=0 chnl=0 letter=\"M\"\r\nchar id=78     x=204   y=450   width=99    height=103   xoffset=-0    yoffset=24    xadvance=84    page=0 chnl=0 letter=\"N\"\r\nchar id=79     x=165   y=132   width=108   height=106   xoffset=-0    yoffset=22    xadvance=93    page=0 chnl=0 letter=\"O\"\r\nchar id=80     x=549   y=346   width=104   height=103   xoffset=-0    yoffset=24    xadvance=90    page=0 chnl=0 letter=\"P\"\r\nchar id=81     x=609   y=1     width=108   height=111   xoffset=-0    yoffset=23    xadvance=93    page=0 chnl=0 letter=\"Q\"\r\nchar id=82     x=654   y=346   width=104   height=103   xoffset=-0    yoffset=24    xadvance=90    page=0 chnl=0 letter=\"R\"\r\nchar id=83     x=1     y=132   width=100   height=107   xoffset=-0    yoffset=21    xadvance=85    page=0 chnl=0 letter=\"S\"\r\nchar id=84     x=1     y=450   width=101   height=103   xoffset=-0    yoffset=24    xadvance=87    page=0 chnl=0 letter=\"T\"\r\nchar id=85     x=631   y=240   width=103   height=104   xoffset=-0    yoffset=24    xadvance=89    page=0 chnl=0 letter=\"U\"\r\nchar id=86     x=334   y=346   width=107   height=103   xoffset=-0    yoffset=24    xadvance=92    page=0 chnl=0 letter=\"V\"\r\nchar id=87     x=298   y=240   width=114   height=104   xoffset=-0    yoffset=23    xadvance=100   page=0 chnl=0 letter=\"W\"\r\nchar id=88     x=523   y=240   width=107   height=104   xoffset=-0    yoffset=24    xadvance=92    page=0 chnl=0 letter=\"X\"\r\nchar id=89     x=442   y=346   width=106   height=103   xoffset=-0    yoffset=24    xadvance=91    page=0 chnl=0 letter=\"Y\"\r\nchar id=90     x=497   y=450   width=95    height=103   xoffset=-0    yoffset=24    xadvance=81    page=0 chnl=0 letter=\"Z\"\r\nchar id=91     x=176   y=1     width=59    height=129   xoffset=-0    yoffset=9     xadvance=45    page=0 chnl=0 letter=\"[\"\r\nchar id=92     x=885   y=132   width=67    height=106   xoffset=-0    yoffset=22    xadvance=53    page=0 chnl=0 letter=\"\\\"\r\nchar id=93     x=115   y=1     width=60    height=129   xoffset=-0    yoffset=9     xadvance=45    page=0 chnl=0 letter=\"]\"\r\nchar id=94     x=870   y=745   width=68    height=52    xoffset=-0    yoffset=6     xadvance=53    page=0 chnl=0 letter=\"^\"\r\nchar id=95     x=247   y=838   width=78    height=40    xoffset=-0    yoffset=105   xadvance=64    page=0 chnl=0 letter=\"_\"\r\nchar id=96     x=393   y=838   width=44    height=38    xoffset=-0    yoffset=0     xadvance=30    page=0 chnl=0 letter=\"`\"\r\nchar id=97     x=533   y=554   width=98    height=93    xoffset=-0    yoffset=34    xadvance=83    page=0 chnl=0 letter=\"a\"\r\nchar id=98     x=733   y=651   width=91    height=92    xoffset=-0    yoffset=35    xadvance=76    page=0 chnl=0 letter=\"b\"\r\nchar id=99     x=190   y=554   width=95    height=95    xoffset=-0    yoffset=33    xadvance=81    page=0 chnl=0 letter=\"c\"\r\nchar id=100    x=917   y=651   width=90    height=92    xoffset=-0    yoffset=35    xadvance=75    page=0 chnl=0 letter=\"d\"\r\nchar id=101    x=1     y=745   width=86    height=92    xoffset=-0    yoffset=35    xadvance=71    page=0 chnl=0 letter=\"e\"\r\nchar id=102    x=88    y=745   width=85    height=92    xoffset=-0    yoffset=35    xadvance=70    page=0 chnl=0 letter=\"f\"\r\nchar id=103    x=286   y=554   width=95    height=95    xoffset=-0    yoffset=33    xadvance=80    page=0 chnl=0 letter=\"g\"\r\nchar id=104    x=444   y=651   width=97    height=92    xoffset=-0    yoffset=35    xadvance=83    page=0 chnl=0 letter=\"h\"\r\nchar id=105    x=257   y=745   width=56    height=92    xoffset=-0    yoffset=35    xadvance=42    page=0 chnl=0 letter=\"i\"\r\nchar id=106    x=272   y=651   width=68    height=93    xoffset=-0    yoffset=35    xadvance=53    page=0 chnl=0 letter=\"j\"\r\nchar id=107    x=921   y=554   width=93    height=93    xoffset=-0    yoffset=34    xadvance=78    page=0 chnl=0 letter=\"k\"\r\nchar id=108    x=174   y=745   width=82    height=92    xoffset=-0    yoffset=35    xadvance=68    page=0 chnl=0 letter=\"l\"\r\nchar id=109    x=341   y=651   width=102   height=92    xoffset=-0    yoffset=35    xadvance=88    page=0 chnl=0 letter=\"m\"\r\nchar id=110    x=95    y=651   width=89    height=93    xoffset=-0    yoffset=34    xadvance=74    page=0 chnl=0 letter=\"n\"\r\nchar id=111    x=92    y=554   width=97    height=95    xoffset=-0    yoffset=33    xadvance=82    page=0 chnl=0 letter=\"o\"\r\nchar id=112    x=638   y=651   width=94    height=92    xoffset=-0    yoffset=35    xadvance=79    page=0 chnl=0 letter=\"p\"\r\nchar id=113    x=925   y=450   width=97    height=100   xoffset=-0    yoffset=33    xadvance=82    page=0 chnl=0 letter=\"q\"\r\nchar id=114    x=826   y=554   width=94    height=93    xoffset=-0    yoffset=34    xadvance=79    page=0 chnl=0 letter=\"r\"\r\nchar id=115    x=1     y=554   width=90    height=96    xoffset=-0    yoffset=32    xadvance=75    page=0 chnl=0 letter=\"s\"\r\nchar id=116    x=825   y=651   width=91    height=92    xoffset=-0    yoffset=35    xadvance=77    page=0 chnl=0 letter=\"t\"\r\nchar id=117    x=1     y=651   width=93    height=93    xoffset=-0    yoffset=35    xadvance=78    page=0 chnl=0 letter=\"u\"\r\nchar id=118    x=632   y=554   width=96    height=93    xoffset=-0    yoffset=34    xadvance=81    page=0 chnl=0 letter=\"v\"\r\nchar id=119    x=429   y=554   width=103   height=93    xoffset=-0    yoffset=34    xadvance=88    page=0 chnl=0 letter=\"w\"\r\nchar id=120    x=729   y=554   width=96    height=93    xoffset=-0    yoffset=34    xadvance=81    page=0 chnl=0 letter=\"x\"\r\nchar id=121    x=542   y=651   width=95    height=92    xoffset=-0    yoffset=35    xadvance=80    page=0 chnl=0 letter=\"y\"\r\nchar id=122    x=185   y=651   width=86    height=93    xoffset=-0    yoffset=34    xadvance=71    page=0 chnl=0 letter=\"z\"\r\nchar id=123    x=1     y=1     width=56    height=130   xoffset=-0    yoffset=9     xadvance=42    page=0 chnl=0 letter=\"{\"\r\nchar id=124    x=449   y=1     width=40    height=125   xoffset=-0    yoffset=11    xadvance=26    page=0 chnl=0 letter=\"|\"\r\nchar id=125    x=58    y=1     width=56    height=130   xoffset=-0    yoffset=9     xadvance=42    page=0 chnl=0 letter=\"}\"\r\nchar id=126    x=1     y=838   width=88    height=51    xoffset=-0    yoffset=7     xadvance=73    page=0 chnl=0 letter=\"~\"\r\nchar id=8226   x=644   y=745   width=58    height=58    xoffset=-0    yoffset=52    xadvance=44    page=0 chnl=0 letter=\"•\"\r\nkernings count=506\r\nkerning first=47 second=47 amount=-12\r\nkerning first=65 second=67 amount=-5\r\nkerning first=65 second=71 amount=-5\r\nkerning first=65 second=79 amount=-5\r\nkerning first=65 second=81 amount=-5\r\nkerning first=65 second=84 amount=-17\r\nkerning first=65 second=85 amount=-5\r\nkerning first=65 second=86 amount=-18\r\nkerning first=65 second=87 amount=-8\r\nkerning first=65 second=89 amount=-21\r\nkerning first=65 second=99 amount=-3\r\nkerning first=65 second=103 amount=-3\r\nkerning first=65 second=111 amount=-3\r\nkerning first=65 second=113 amount=-3\r\nkerning first=65 second=116 amount=-14\r\nkerning first=65 second=117 amount=-3\r\nkerning first=65 second=118 amount=-14\r\nkerning first=65 second=119 amount=-7\r\nkerning first=65 second=121 amount=-17\r\nkerning first=66 second=74 amount=-3\r\nkerning first=66 second=84 amount=-3\r\nkerning first=66 second=86 amount=-3\r\nkerning first=66 second=88 amount=-4\r\nkerning first=66 second=89 amount=-5\r\nkerning first=66 second=105 amount=3\r\nkerning first=66 second=106 amount=-3\r\nkerning first=67 second=65 amount=-6\r\nkerning first=67 second=74 amount=-8\r\nkerning first=67 second=84 amount=-5\r\nkerning first=67 second=86 amount=-5\r\nkerning first=67 second=87 amount=-3\r\nkerning first=67 second=88 amount=-7\r\nkerning first=67 second=89 amount=-7\r\nkerning first=67 second=90 amount=-3\r\nkerning first=67 second=97 amount=-6\r\nkerning first=67 second=106 amount=-9\r\nkerning first=67 second=120 amount=-3\r\nkerning first=67 second=121 amount=-4\r\nkerning first=68 second=65 amount=-6\r\nkerning first=68 second=74 amount=-10\r\nkerning first=68 second=84 amount=-6\r\nkerning first=68 second=86 amount=-6\r\nkerning first=68 second=87 amount=-3\r\nkerning first=68 second=88 amount=-9\r\nkerning first=68 second=89 amount=-9\r\nkerning first=68 second=90 amount=-4\r\nkerning first=68 second=97 amount=-6\r\nkerning first=68 second=106 amount=-9\r\nkerning first=68 second=120 amount=-4\r\nkerning first=68 second=121 amount=-5\r\nkerning first=69 second=67 amount=-3\r\nkerning first=69 second=71 amount=-3\r\nkerning first=69 second=79 amount=-3\r\nkerning first=69 second=81 amount=-3\r\nkerning first=70 second=65 amount=-14\r\nkerning first=70 second=67 amount=-5\r\nkerning first=70 second=71 amount=-5\r\nkerning first=70 second=74 amount=-13\r\nkerning first=70 second=77 amount=-5\r\nkerning first=70 second=79 amount=-5\r\nkerning first=70 second=81 amount=-5\r\nkerning first=70 second=83 amount=-3\r\nkerning first=70 second=89 amount=-3\r\nkerning first=70 second=97 amount=-14\r\nkerning first=70 second=99 amount=-7\r\nkerning first=70 second=103 amount=-7\r\nkerning first=70 second=106 amount=-12\r\nkerning first=70 second=109 amount=-6\r\nkerning first=70 second=111 amount=-7\r\nkerning first=70 second=113 amount=-7\r\nkerning first=70 second=115 amount=-5\r\nkerning first=70 second=116 amount=-3\r\nkerning first=70 second=121 amount=-3\r\nkerning first=71 second=84 amount=-4\r\nkerning first=71 second=86 amount=-3\r\nkerning first=71 second=89 amount=-6\r\nkerning first=72 second=66 amount=3\r\nkerning first=72 second=68 amount=3\r\nkerning first=72 second=69 amount=3\r\nkerning first=72 second=70 amount=3\r\nkerning first=72 second=72 amount=3\r\nkerning first=72 second=73 amount=3\r\nkerning first=72 second=75 amount=3\r\nkerning first=72 second=76 amount=3\r\nkerning first=72 second=78 amount=3\r\nkerning first=72 second=80 amount=3\r\nkerning first=72 second=82 amount=3\r\nkerning first=72 second=98 amount=3\r\nkerning first=72 second=100 amount=3\r\nkerning first=72 second=101 amount=3\r\nkerning first=72 second=102 amount=3\r\nkerning first=72 second=104 amount=3\r\nkerning first=72 second=105 amount=3\r\nkerning first=72 second=107 amount=3\r\nkerning first=72 second=108 amount=3\r\nkerning first=72 second=109 amount=3\r\nkerning first=72 second=110 amount=3\r\nkerning first=72 second=112 amount=3\r\nkerning first=72 second=114 amount=3\r\nkerning first=72 second=117 amount=3\r\nkerning first=73 second=66 amount=3\r\nkerning first=73 second=68 amount=3\r\nkerning first=73 second=69 amount=3\r\nkerning first=73 second=70 amount=3\r\nkerning first=73 second=72 amount=3\r\nkerning first=73 second=73 amount=3\r\nkerning first=73 second=75 amount=3\r\nkerning first=73 second=76 amount=3\r\nkerning first=73 second=78 amount=3\r\nkerning first=73 second=80 amount=3\r\nkerning first=73 second=82 amount=3\r\nkerning first=73 second=98 amount=3\r\nkerning first=73 second=100 amount=3\r\nkerning first=73 second=101 amount=3\r\nkerning first=73 second=102 amount=3\r\nkerning first=73 second=104 amount=3\r\nkerning first=73 second=105 amount=3\r\nkerning first=73 second=107 amount=3\r\nkerning first=73 second=108 amount=3\r\nkerning first=73 second=110 amount=3\r\nkerning first=73 second=112 amount=3\r\nkerning first=73 second=114 amount=3\r\nkerning first=74 second=65 amount=-6\r\nkerning first=74 second=74 amount=-10\r\nkerning first=74 second=97 amount=-7\r\nkerning first=74 second=106 amount=-9\r\nkerning first=75 second=67 amount=-4\r\nkerning first=75 second=71 amount=-4\r\nkerning first=75 second=79 amount=-4\r\nkerning first=75 second=81 amount=-4\r\nkerning first=75 second=84 amount=-3\r\nkerning first=75 second=85 amount=-3\r\nkerning first=75 second=86 amount=-3\r\nkerning first=75 second=89 amount=-3\r\nkerning first=75 second=99 amount=-3\r\nkerning first=75 second=103 amount=-3\r\nkerning first=75 second=111 amount=-3\r\nkerning first=75 second=113 amount=-3\r\nkerning first=75 second=116 amount=-5\r\nkerning first=75 second=117 amount=-3\r\nkerning first=75 second=118 amount=-5\r\nkerning first=75 second=119 amount=-4\r\nkerning first=75 second=121 amount=-5\r\nkerning first=76 second=65 amount=-3\r\nkerning first=76 second=67 amount=-6\r\nkerning first=76 second=71 amount=-6\r\nkerning first=76 second=74 amount=-3\r\nkerning first=76 second=79 amount=-6\r\nkerning first=76 second=81 amount=-6\r\nkerning first=76 second=84 amount=-18\r\nkerning first=76 second=85 amount=-7\r\nkerning first=76 second=86 amount=-21\r\nkerning first=76 second=87 amount=-9\r\nkerning first=76 second=88 amount=-4\r\nkerning first=76 second=89 amount=-23\r\nkerning first=76 second=97 amount=-3\r\nkerning first=76 second=99 amount=-4\r\nkerning first=76 second=103 amount=-4\r\nkerning first=76 second=111 amount=-4\r\nkerning first=76 second=113 amount=-4\r\nkerning first=76 second=116 amount=-15\r\nkerning first=76 second=117 amount=-5\r\nkerning first=76 second=118 amount=-17\r\nkerning first=76 second=119 amount=-8\r\nkerning first=76 second=120 amount=-4\r\nkerning first=76 second=121 amount=-19\r\nkerning first=77 second=84 amount=-7\r\nkerning first=77 second=86 amount=-7\r\nkerning first=77 second=87 amount=-5\r\nkerning first=77 second=89 amount=-8\r\nkerning first=77 second=116 amount=-4\r\nkerning first=77 second=118 amount=-4\r\nkerning first=77 second=119 amount=-4\r\nkerning first=77 second=121 amount=-5\r\nkerning first=78 second=66 amount=3\r\nkerning first=78 second=68 amount=3\r\nkerning first=78 second=69 amount=3\r\nkerning first=78 second=70 amount=3\r\nkerning first=78 second=72 amount=3\r\nkerning first=78 second=73 amount=3\r\nkerning first=78 second=75 amount=3\r\nkerning first=78 second=76 amount=3\r\nkerning first=78 second=77 amount=3\r\nkerning first=78 second=78 amount=3\r\nkerning first=78 second=80 amount=3\r\nkerning first=78 second=82 amount=3\r\nkerning first=78 second=98 amount=3\r\nkerning first=78 second=100 amount=3\r\nkerning first=78 second=101 amount=3\r\nkerning first=78 second=102 amount=3\r\nkerning first=78 second=104 amount=3\r\nkerning first=78 second=105 amount=3\r\nkerning first=78 second=107 amount=3\r\nkerning first=78 second=108 amount=3\r\nkerning first=78 second=109 amount=3\r\nkerning first=78 second=110 amount=3\r\nkerning first=78 second=112 amount=3\r\nkerning first=78 second=114 amount=3\r\nkerning first=78 second=117 amount=3\r\nkerning first=79 second=65 amount=-6\r\nkerning first=79 second=74 amount=-8\r\nkerning first=79 second=84 amount=-5\r\nkerning first=79 second=86 amount=-5\r\nkerning first=79 second=88 amount=-7\r\nkerning first=79 second=89 amount=-8\r\nkerning first=79 second=90 amount=-3\r\nkerning first=79 second=97 amount=-5\r\nkerning first=79 second=106 amount=-8\r\nkerning first=79 second=120 amount=-3\r\nkerning first=79 second=121 amount=-4\r\nkerning first=80 second=65 amount=-13\r\nkerning first=80 second=74 amount=-13\r\nkerning first=80 second=77 amount=-3\r\nkerning first=80 second=84 amount=-4\r\nkerning first=80 second=86 amount=-4\r\nkerning first=80 second=87 amount=-3\r\nkerning first=80 second=88 amount=-5\r\nkerning first=80 second=89 amount=-6\r\nkerning first=80 second=90 amount=-3\r\nkerning first=80 second=97 amount=-13\r\nkerning first=80 second=106 amount=-12\r\nkerning first=80 second=109 amount=-4\r\nkerning first=80 second=116 amount=-3\r\nkerning first=80 second=118 amount=-3\r\nkerning first=80 second=121 amount=-3\r\nkerning first=81 second=65 amount=-5\r\nkerning first=81 second=74 amount=-6\r\nkerning first=81 second=84 amount=-5\r\nkerning first=81 second=86 amount=-5\r\nkerning first=81 second=88 amount=-6\r\nkerning first=81 second=89 amount=-8\r\nkerning first=81 second=90 amount=-3\r\nkerning first=81 second=97 amount=-5\r\nkerning first=81 second=100 amount=3\r\nkerning first=81 second=104 amount=3\r\nkerning first=81 second=105 amount=3\r\nkerning first=81 second=106 amount=-5\r\nkerning first=81 second=107 amount=3\r\nkerning first=81 second=120 amount=-3\r\nkerning first=81 second=121 amount=-4\r\nkerning first=82 second=84 amount=-3\r\nkerning first=82 second=86 amount=-3\r\nkerning first=82 second=89 amount=-5\r\nkerning first=83 second=65 amount=-4\r\nkerning first=83 second=74 amount=-4\r\nkerning first=83 second=97 amount=-4\r\nkerning first=83 second=106 amount=-5\r\nkerning first=84 second=65 amount=-20\r\nkerning first=84 second=67 amount=-6\r\nkerning first=84 second=71 amount=-6\r\nkerning first=84 second=74 amount=-13\r\nkerning first=84 second=77 amount=-6\r\nkerning first=84 second=79 amount=-6\r\nkerning first=84 second=81 amount=-6\r\nkerning first=84 second=83 amount=-4\r\nkerning first=84 second=84 amount=-3\r\nkerning first=84 second=89 amount=-3\r\nkerning first=84 second=97 amount=-21\r\nkerning first=84 second=99 amount=-9\r\nkerning first=84 second=103 amount=-9\r\nkerning first=84 second=106 amount=-12\r\nkerning first=84 second=108 amount=-3\r\nkerning first=84 second=109 amount=-7\r\nkerning first=84 second=110 amount=-3\r\nkerning first=84 second=111 amount=-9\r\nkerning first=84 second=113 amount=-9\r\nkerning first=84 second=115 amount=-6\r\nkerning first=84 second=116 amount=-3\r\nkerning first=84 second=117 amount=-3\r\nkerning first=84 second=118 amount=-3\r\nkerning first=84 second=121 amount=-3\r\nkerning first=85 second=65 amount=-5\r\nkerning first=85 second=74 amount=-7\r\nkerning first=85 second=97 amount=-5\r\nkerning first=85 second=104 amount=3\r\nkerning first=85 second=105 amount=3\r\nkerning first=85 second=106 amount=-7\r\nkerning first=86 second=65 amount=-17\r\nkerning first=86 second=67 amount=-5\r\nkerning first=86 second=71 amount=-5\r\nkerning first=86 second=74 amount=-12\r\nkerning first=86 second=77 amount=-5\r\nkerning first=86 second=79 amount=-5\r\nkerning first=86 second=81 amount=-5\r\nkerning first=86 second=83 amount=-3\r\nkerning first=86 second=97 amount=-18\r\nkerning first=86 second=99 amount=-6\r\nkerning first=86 second=103 amount=-7\r\nkerning first=86 second=106 amount=-12\r\nkerning first=86 second=109 amount=-7\r\nkerning first=86 second=111 amount=-7\r\nkerning first=86 second=113 amount=-6\r\nkerning first=86 second=115 amount=-5\r\nkerning first=86 second=116 amount=-3\r\nkerning first=87 second=65 amount=-7\r\nkerning first=87 second=74 amount=-7\r\nkerning first=87 second=97 amount=-7\r\nkerning first=87 second=106 amount=-7\r\nkerning first=88 second=67 amount=-7\r\nkerning first=88 second=71 amount=-7\r\nkerning first=88 second=79 amount=-7\r\nkerning first=88 second=81 amount=-7\r\nkerning first=88 second=99 amount=-5\r\nkerning first=88 second=103 amount=-6\r\nkerning first=88 second=111 amount=-5\r\nkerning first=88 second=113 amount=-5\r\nkerning first=88 second=116 amount=-6\r\nkerning first=88 second=117 amount=-6\r\nkerning first=88 second=118 amount=-6\r\nkerning first=88 second=119 amount=-5\r\nkerning first=88 second=121 amount=-5\r\nkerning first=89 second=65 amount=-19\r\nkerning first=89 second=67 amount=-7\r\nkerning first=89 second=71 amount=-8\r\nkerning first=89 second=74 amount=-13\r\nkerning first=89 second=77 amount=-7\r\nkerning first=89 second=79 amount=-8\r\nkerning first=89 second=81 amount=-8\r\nkerning first=89 second=83 amount=-5\r\nkerning first=89 second=84 amount=-3\r\nkerning first=89 second=97 amount=-19\r\nkerning first=89 second=98 amount=-4\r\nkerning first=89 second=99 amount=-10\r\nkerning first=89 second=100 amount=-3\r\nkerning first=89 second=101 amount=-4\r\nkerning first=89 second=102 amount=-4\r\nkerning first=89 second=103 amount=-10\r\nkerning first=89 second=104 amount=-3\r\nkerning first=89 second=105 amount=-3\r\nkerning first=89 second=106 amount=-13\r\nkerning first=89 second=107 amount=-3\r\nkerning first=89 second=108 amount=-4\r\nkerning first=89 second=109 amount=-9\r\nkerning first=89 second=110 amount=-4\r\nkerning first=89 second=111 amount=-10\r\nkerning first=89 second=112 amount=-4\r\nkerning first=89 second=113 amount=-10\r\nkerning first=89 second=114 amount=-4\r\nkerning first=89 second=115 amount=-8\r\nkerning first=89 second=116 amount=-5\r\nkerning first=89 second=117 amount=-4\r\nkerning first=89 second=118 amount=-4\r\nkerning first=89 second=119 amount=-4\r\nkerning first=89 second=120 amount=-3\r\nkerning first=89 second=121 amount=-4\r\nkerning first=89 second=122 amount=-4\r\nkerning first=90 second=67 amount=-3\r\nkerning first=90 second=71 amount=-3\r\nkerning first=90 second=79 amount=-3\r\nkerning first=90 second=81 amount=-3\r\nkerning first=92 second=92 amount=-12\r\nkerning first=97 second=99 amount=-4\r\nkerning first=97 second=103 amount=-4\r\nkerning first=97 second=111 amount=-4\r\nkerning first=97 second=113 amount=-4\r\nkerning first=97 second=116 amount=-14\r\nkerning first=97 second=117 amount=-4\r\nkerning first=97 second=118 amount=-15\r\nkerning first=97 second=119 amount=-7\r\nkerning first=97 second=121 amount=-18\r\nkerning first=98 second=120 amount=-3\r\nkerning first=98 second=121 amount=-3\r\nkerning first=99 second=97 amount=-4\r\nkerning first=99 second=106 amount=-6\r\nkerning first=99 second=116 amount=-3\r\nkerning first=99 second=118 amount=-3\r\nkerning first=99 second=120 amount=-5\r\nkerning first=99 second=121 amount=-5\r\nkerning first=100 second=97 amount=-5\r\nkerning first=100 second=106 amount=-8\r\nkerning first=100 second=116 amount=-5\r\nkerning first=100 second=118 amount=-4\r\nkerning first=100 second=120 amount=-7\r\nkerning first=100 second=121 amount=-7\r\nkerning first=100 second=122 amount=-3\r\nkerning first=101 second=99 amount=-3\r\nkerning first=101 second=103 amount=-3\r\nkerning first=101 second=111 amount=-3\r\nkerning first=101 second=113 amount=-3\r\nkerning first=102 second=97 amount=-12\r\nkerning first=102 second=99 amount=-4\r\nkerning first=102 second=103 amount=-4\r\nkerning first=102 second=106 amount=-11\r\nkerning first=102 second=109 amount=-4\r\nkerning first=102 second=111 amount=-4\r\nkerning first=102 second=113 amount=-4\r\nkerning first=103 second=121 amount=-5\r\nkerning first=104 second=98 amount=3\r\nkerning first=104 second=100 amount=3\r\nkerning first=104 second=101 amount=3\r\nkerning first=104 second=102 amount=3\r\nkerning first=104 second=104 amount=3\r\nkerning first=104 second=105 amount=3\r\nkerning first=104 second=107 amount=3\r\nkerning first=104 second=108 amount=3\r\nkerning first=104 second=109 amount=3\r\nkerning first=104 second=110 amount=3\r\nkerning first=104 second=112 amount=3\r\nkerning first=104 second=114 amount=3\r\nkerning first=104 second=117 amount=3\r\nkerning first=105 second=98 amount=3\r\nkerning first=105 second=100 amount=3\r\nkerning first=105 second=101 amount=3\r\nkerning first=105 second=102 amount=3\r\nkerning first=105 second=104 amount=3\r\nkerning first=105 second=105 amount=3\r\nkerning first=105 second=107 amount=3\r\nkerning first=105 second=108 amount=3\r\nkerning first=105 second=110 amount=3\r\nkerning first=105 second=112 amount=3\r\nkerning first=105 second=114 amount=3\r\nkerning first=105 second=117 amount=3\r\nkerning first=106 second=97 amount=-5\r\nkerning first=106 second=106 amount=-8\r\nkerning first=107 second=99 amount=-3\r\nkerning first=107 second=103 amount=-3\r\nkerning first=107 second=111 amount=-3\r\nkerning first=107 second=113 amount=-3\r\nkerning first=108 second=99 amount=-4\r\nkerning first=108 second=103 amount=-4\r\nkerning first=108 second=111 amount=-4\r\nkerning first=108 second=113 amount=-4\r\nkerning first=108 second=116 amount=-15\r\nkerning first=108 second=117 amount=-5\r\nkerning first=108 second=118 amount=-18\r\nkerning first=108 second=119 amount=-8\r\nkerning first=108 second=120 amount=-3\r\nkerning first=108 second=121 amount=-19\r\nkerning first=109 second=116 amount=-5\r\nkerning first=109 second=118 amount=-5\r\nkerning first=109 second=119 amount=-4\r\nkerning first=109 second=121 amount=-7\r\nkerning first=110 second=98 amount=3\r\nkerning first=110 second=100 amount=3\r\nkerning first=110 second=101 amount=3\r\nkerning first=110 second=102 amount=3\r\nkerning first=110 second=104 amount=3\r\nkerning first=110 second=105 amount=3\r\nkerning first=110 second=107 amount=3\r\nkerning first=110 second=108 amount=3\r\nkerning first=110 second=110 amount=3\r\nkerning first=110 second=112 amount=3\r\nkerning first=110 second=114 amount=3\r\nkerning first=110 second=117 amount=3\r\nkerning first=111 second=97 amount=-4\r\nkerning first=111 second=106 amount=-7\r\nkerning first=111 second=116 amount=-4\r\nkerning first=111 second=118 amount=-3\r\nkerning first=111 second=120 amount=-6\r\nkerning first=111 second=121 amount=-6\r\nkerning first=112 second=97 amount=-11\r\nkerning first=112 second=106 amount=-11\r\nkerning first=112 second=116 amount=-3\r\nkerning first=112 second=118 amount=-3\r\nkerning first=112 second=120 amount=-4\r\nkerning first=112 second=121 amount=-5\r\nkerning first=113 second=97 amount=-4\r\nkerning first=113 second=106 amount=-5\r\nkerning first=113 second=116 amount=-4\r\nkerning first=113 second=118 amount=-3\r\nkerning first=113 second=120 amount=-5\r\nkerning first=113 second=121 amount=-6\r\nkerning first=114 second=121 amount=-4\r\nkerning first=115 second=97 amount=-3\r\nkerning first=115 second=106 amount=-4\r\nkerning first=116 second=97 amount=-17\r\nkerning first=116 second=99 amount=-4\r\nkerning first=116 second=103 amount=-4\r\nkerning first=116 second=106 amount=-11\r\nkerning first=116 second=109 amount=-4\r\nkerning first=116 second=111 amount=-4\r\nkerning first=116 second=113 amount=-4\r\nkerning first=117 second=97 amount=-4\r\nkerning first=117 second=98 amount=3\r\nkerning first=117 second=100 amount=3\r\nkerning first=117 second=101 amount=3\r\nkerning first=117 second=102 amount=3\r\nkerning first=117 second=104 amount=3\r\nkerning first=117 second=105 amount=3\r\nkerning first=117 second=106 amount=-5\r\nkerning first=117 second=107 amount=3\r\nkerning first=117 second=108 amount=3\r\nkerning first=117 second=110 amount=3\r\nkerning first=117 second=112 amount=3\r\nkerning first=117 second=114 amount=3\r\nkerning first=118 second=97 amount=-14\r\nkerning first=118 second=99 amount=-3\r\nkerning first=118 second=103 amount=-3\r\nkerning first=118 second=106 amount=-10\r\nkerning first=118 second=109 amount=-4\r\nkerning first=118 second=111 amount=-3\r\nkerning first=118 second=113 amount=-3\r\nkerning first=119 second=97 amount=-6\r\nkerning first=119 second=106 amount=-6\r\nkerning first=120 second=99 amount=-6\r\nkerning first=120 second=103 amount=-6\r\nkerning first=120 second=111 amount=-6\r\nkerning first=120 second=113 amount=-6\r\nkerning first=121 second=97 amount=-16\r\nkerning first=121 second=99 amount=-6\r\nkerning first=121 second=103 amount=-6\r\nkerning first=121 second=106 amount=-10\r\nkerning first=121 second=109 amount=-5\r\nkerning first=121 second=111 amount=-6\r\nkerning first=121 second=113 amount=-6\r\nkerning first=121 second=115 amount=-4\r\n  }\r\n }\r\n}  \r\n?xml version = 1.0 encoding=UTF-8?\r\n!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd\r\nplist version = 1.0\r\ndict\r\nkeyangle/key\r\nreal90/real\r\nkeyangleVariance/key\r\nreal45/real\r\nkeyblendFuncDestination/key\r\ninteger1/integer\r\nkeyblendFuncSource/key\r\ninteger770/integer\r\nkeyduration/key\r\nreal-1/real\r\nkeyemitterType/key\r\nreal0.0/real\r\nkeyfinishColorAlpha/key\r\nreal1/real\r\nkeyfinishColorBlue/key\r\nreal0.0/real\r\nkeyfinishColorGreen/key\r\nreal0.0/real\r\nkeyfinishColorRed/key\r\nreal0.0/real\r\nkeyfinishColorVarianceAlpha/key\r\nreal0.0/real\r\nkeyfinishColorVarianceBlue/key\r\nreal0.0/real\r\nkeyfinishColorVarianceGreen/key\r\nreal0.0/real\r\nkeyfinishColorVarianceRed/key\r\nreal0.0/real\r\nkeyfinishParticleSize/key\r\nreal0.0/real\r\nkeyfinishParticleSizeVariance/key\r\nreal0.0/real\r\nkeygravityx/key\r\nreal0.0/real\r\nkeygravityy/key\r\nreal0.0/real\r\nkeymaxParticles/key\r\nreal50/real\r\nkeymaxRadius/key\r\nreal100/real\r\nkeymaxRadiusVariance/key\r\nreal0.0/real\r\nkeyminRadius/ke\r\nreal0.0/real\r\nkeyparticleLifespan/key\r\nreal0.0/real\r\nkeyparticleLifespanVariance/key\r\nreal1.5/real\r\nkeyradialAccelVariance/key\r\nreal0.0/real\r\nkeyradialAcceleration/key\r\nreal0.0/real\r\nkeyrotatePerSecond/key\r\nreal0.0/real\r\nkeyrotatePerSecondVariance/key\r\nreal0.0/real\r\nkeyrotationEnd/key\r\nreal0.0/real\r\nkeyrotationEndVariance/key\r\nreal0.0/real\r\nkeyrotationStart/key\r\nreal0.0/real\r\nkeyrotationStartVariance/key\r\nreal0.0/real\r\nkeysourcePositionVariancex/key\r\nreal46/real\r\nkeysourcePositionVariancey/key\r\nreal0.0/real\r\nkeysourcePositionx/key\r\nreal240.65878295898438/real\r\nkeysourcePositiony/key\r\nreal162.94760131835938/real\r\nkeyspeed/key\r\nreal40/real\r\nkeyspeedVariance/key\r\nreal15/real\r\nkeystartColorAlpha/key\r\nreal0.5/real\r\nkeystartColorBlue/key\r\nreal1/real\r\nkeystartColorGreen/key\r\nreal1/real\r\nkeystartColorRed/key\r\nreal1/real\r\nkeystartColorVarianceAlpha/key\r\nreal0.5/real\r\nkeystartColorVarianceBlue/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceGreen/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceRed/key\r\nreal0.10000000149011612/real\r\nkeystartParticleSize/key\r\nreal4/real\r\nkeystartParticleSizeVariance/key\r\nreal1/real\r\nkeytangentialAccelVariance/key\r\nreal0.0/real\r\nkeytangentialAcceleration/key\r\nreal0.0/real\r\nkeytextureFileName/key\r\nstringsquare.png/string\r\n/dict\r\n/plist\r\n?xml version = 1.0 encoding=UTF-8?\r\n!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd\r\nplist version = 1.0\r\ndict\r\nkeyangle/key\r\nreal90/real\r\nkeyangleVariance/key\r\nreal45/real\r\nkeyblendFuncDestination/key\r\ninteger1/integer\r\nkeyblendFuncSource/key\r\ninteger770/integer\r\nkeyduration/key\r\nreal-1/real\r\nkeyemitterType/key\r\nreal0.0/real\r\nkeyfinishColorAlpha/key\r\nreal1/real\r\nkeyfinishColorBlue/key\r\nreal0.0/real\r\nkeyfinishColorGreen/key\r\nreal0.0/real\r\nkeyfinishColorRed/key\r\nreal0.0/real\r\nkeyfinishColorVarianceAlpha/key\r\nreal0.0/real\r\nkeyfinishColorVarianceBlue/key\r\nreal0.0/real\r\nkeyfinishColorVarianceGreen/key\r\nreal0.0/real\r\nkeyfinishColorVarianceRed/key\r\nreal0.0/real\r\nkeyfinishParticleSize/key\r\nreal0.0/real\r\nkeyfinishParticleSizeVariance/key\r\nreal0.0/real\r\nkeygravityx/key\r\nreal0.0/real\r\nkeygravityy/key\r\nreal0.0/real\r\nkeymaxParticles/key\r\nreal50/real\r\nkeymaxRadius/key\r\nreal100/real\r\nkeymaxRadiusVariance/key\r\nreal0.0/real\r\nkeyminRadius/ke\r\nreal0.0/real\r\nkeyparticleLifespan/key\r\nreal0.0/real\r\nkeyparticleLifespanVariance/key\r\nreal1.5/real\r\nkeyradialAccelVariance/key\r\nreal0.0/real\r\nkeyradialAcceleration/key\r\nreal0.0/real\r\nkeyrotatePerSecond/key\r\nreal0.0/real\r\nkeyrotatePerSecondVariance/key\r\nreal0.0/real\r\nkeyrotationEnd/key\r\nreal0.0/real\r\nkeyrotationEndVariance/key\r\nreal0.0/real\r\nkeyrotationStart/key\r\nreal0.0/real\r\nkeyrotationStartVariance/key\r\nreal0.0/real\r\nkeysourcePositionVariancex/key\r\nreal46/real\r\nkeysourcePositionVariancey/key\r\nreal0.0/real\r\nkeysourcePositionx/key\r\nreal240.65878295898438/real\r\nkeysourcePositiony/key\r\nreal162.94760131835938/real\r\nkeyspeed/key\r\nreal40/real\r\nkeyspeedVariance/key\r\nreal15/real\r\nkeystartColorAlpha/key\r\nreal0.5/real\r\nkeystartColorBlue/key\r\nreal1/real\r\nkeystartColorGreen/key\r\nreal1/real\r\nkeystartColorRed/key\r\nreal1/real\r\nkeystartColorVarianceAlpha/key\r\nreal0.5/real\r\nkeystartColorVarianceBlue/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceGreen/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceRed/key\r\nreal0.10000000149011612/real\r\nkeystartParticleSize/key\r\nreal4/real\r\nkeystartParticleSizeVariance/key\r\nreal1/real\r\nkeytangentialAccelVariance/key\r\nreal0.0/real\r\nkeytangentialAcceleration/key\r\nreal0.0/real\r\nkeytextureFileName/key\r\nstringsquare.png/string\r\n/dict\r\n/plist\r\n?xml version = 1.0 encoding=UTF-8?\r\n!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd\r\nplist version = 1.0\r\ndict\r\nkeyangle/key\r\nreal90/real\r\nkeyangleVariance/key\r\nreal45/real\r\nkeyblendFuncDestination/key\r\ninteger1/integer\r\nkeyblendFuncSource/key\r\ninteger770/integer\r\nkeyduration/key\r\nreal-1/real\r\nkeyemitterType/key\r\nreal0.0/real\r\nkeyfinishColorAlpha/key\r\nreal1/real\r\nkeyfinishColorBlue/key\r\nreal0.0/real\r\nkeyfinishColorGreen/key\r\nreal0.0/real\r\nkeyfinishColorRed/key\r\nreal0.0/real\r\nkeyfinishColorVarianceAlpha/key\r\nreal0.0/real\r\nkeyfinishColorVarianceBlue/key\r\nreal0.0/real\r\nkeyfinishColorVarianceGreen/key\r\nreal0.0/real\r\nkeyfinishColorVarianceRed/key\r\nreal0.0/real\r\nkeyfinishParticleSize/key\r\nreal0.0/real\r\nkeyfinishParticleSizeVariance/key\r\nreal0.0/real\r\nkeygravityx/key\r\nreal0.0/real\r\nkeygravityy/key\r\nreal0.0/real\r\nkeymaxParticles/key\r\nreal50/real\r\nkeymaxRadius/key\r\nreal100/real\r\nkeymaxRadiusVariance/key\r\nreal0.0/real\r\nkeyminRadius/ke\r\nreal0.0/real\r\nkeyparticleLifespan/key\r\nreal0.0/real\r\nkeyparticleLifespanVariance/key\r\nreal1.5/real\r\nkeyradialAccelVariance/key\r\nreal0.0/real\r\nkeyradialAcceleration/key\r\nreal0.0/real\r\nkeyrotatePerSecond/key\r\nreal0.0/real\r\nkeyrotatePerSecondVariance/key\r\nreal0.0/real\r\nkeyrotationEnd/key\r\nreal0.0/real\r\nkeyrotationEndVariance/key\r\nreal0.0/real\r\nkeyrotationStart/key\r\nreal0.0/real\r\nkeyrotationStartVariance/key\r\nreal0.0/real\r\nkeysourcePositionVariancex/key\r\nreal46/real\r\nkeysourcePositionVariancey/key\r\nreal0.0/real\r\nkeysourcePositionx/key\r\nreal240.65878295898438/real\r\nkeysourcePositiony/key\r\nreal162.94760131835938/real\r\nkeyspeed/key\r\nreal40/real\r\nkeyspeedVariance/key\r\nreal15/real\r\nkeystartColorAlpha/key\r\nreal0.5/real\r\nkeystartColorBlue/key\r\nreal1/real\r\nkeystartColorGreen/key\r\nreal1/real\r\nkeystartColorRed/key\r\nreal1/real\r\nkeystartColorVarianceAlpha/key\r\nreal0.5/real\r\nkeystartColorVarianceBlue/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceGreen/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceRed/key\r\nreal0.10000000149011612/real\r\nkeystartParticleSize/key\r\nreal4/real\r\nkeystartParticleSizeVariance/key\r\nreal1/real\r\nkeytangentialAccelVariance/key\r\nreal0.0/real\r\nkeytangentialAcceleration/key\r\nreal0.0/real\r\nkeytextureFileName/key\r\nstringsquare.png/string\r\n/dict\r\n/plist\r\n?xml version = 1.0 encoding=UTF-8?\r\n!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd\r\nplist version = 1.0\r\ndict\r\nkeyangle/key\r\nreal90/real\r\nkeyangleVariance/key\r\nreal45/real\r\nkeyblendFuncDestination/key\r\ninteger1/integer\r\nkeyblendFuncSource/key\r\ninteger770/integer\r\nkeyduration/key\r\nreal-1/real\r\nkeyemitterType/key\r\nreal0.0/real\r\nkeyfinishColorAlpha/key\r\nreal1/real\r\nkeyfinishColorBlue/key\r\nreal0.0/real\r\nkeyfinishColorGreen/key\r\nreal0.0/real\r\nkeyfinishColorRed/key\r\nreal0.0/real\r\nkeyfinishColorVarianceAlpha/key\r\nreal0.0/real\r\nkeyfinishColorVarianceBlue/key\r\nreal0.0/real\r\nkeyfinishColorVarianceGreen/key\r\nreal0.0/real\r\nkeyfinishColorVarianceRed/key\r\nreal0.0/real\r\nkeyfinishParticleSize/key\r\nreal0.0/real\r\nkeyfinishParticleSizeVariance/key\r\nreal0.0/real\r\nkeygravityx/key\r\nreal0.0/real\r\nkeygravityy/key\r\nreal0.0/real\r\nkeymaxParticles/key\r\nreal50/real\r\nkeymaxRadius/key\r\nreal100/real\r\nkeymaxRadiusVariance/key\r\nreal0.0/real\r\nkeyminRadius/ke\r\nreal0.0/real\r\nkeyparticleLifespan/key\r\nreal0.0/real\r\nkeyparticleLifespanVariance/key\r\nreal1.5/real\r\nkeyradialAccelVariance/key\r\nreal0.0/real\r\nkeyradialAcceleration/key\r\nreal0.0/real\r\nkeyrotatePerSecond/key\r\nreal0.0/real\r\nkeyrotatePerSecondVariance/key\r\nreal0.0/real\r\nkeyrotationEnd/key\r\nreal0.0/real\r\nkeyrotationEndVariance/key\r\nreal0.0/real\r\nkeyrotationStart/key\r\nreal0.0/real\r\nkeyrotationStartVariance/key\r\nreal0.0/real\r\nkeysourcePositionVariancex/key\r\nreal46/real\r\nkeysourcePositionVariancey/key\r\nreal0.0/real\r\nkeysourcePositionx/key\r\nreal240.65878295898438/real\r\nkeysourcePositiony/key\r\nreal162.94760131835938/real\r\nkeyspeed/key\r\nreal40/real\r\nkeyspeedVariance/key\r\nreal15/real\r\nkeystartColorAlpha/key\r\nreal0.5/real\r\nkeystartColorBlue/key\r\nreal1/real\r\nkeystartColorGreen/key\r\nreal1/real\r\nkeystartColorRed/key\r\nreal1/real\r\nkeystartColorVarianceAlpha/key\r\nreal0.5/real\r\nkeystartColorVarianceBlue/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceGreen/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceRed/key\r\nreal0.10000000149011612/real\r\nkeystartParticleSize/key\r\nreal4/real\r\nkeystartParticleSizeVariance/key\r\nreal1/real\r\nkeytangentialAccelVariance/key\r\nreal0.0/real\r\nkeytangentialAcceleration/key\r\nreal0.0/real\r\nkeytextureFileName/key\r\nstringsquare.png/string\r\n/dict\r\n/plist\r\n?xml version = 1.0 encoding=UTF-8?\r\n!DOCTYPE plist PUBLIC -//Apple//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd\r\nplist version = 1.0\r\ndict\r\nkeyangle/key\r\nreal90/real\r\nkeyangleVariance/key\r\nreal45/real\r\nkeyblendFuncDestination/key\r\ninteger1/integer\r\nkeyblendFuncSource/key\r\ninteger770/integer\r\nkeyduration/key\r\nreal-1/real\r\nkeyemitterType/key\r\nreal0.0/real\r\nkeyfinishColorAlpha/key\r\nreal1/real\r\nkeyfinishColorBlue/key\r\nreal0.0/real\r\nkeyfinishColorGreen/key\r\nreal0.0/real\r\nkeyfinishColorRed/key\r\nreal0.0/real\r\nkeyfinishColorVarianceAlpha/key\r\nreal0.0/real\r\nkeyfinishColorVarianceBlue/key\r\nreal0.0/real\r\nkeyfinishColorVarianceGreen/key\r\nreal0.0/real\r\nkeyfinishColorVarianceRed/key\r\nreal0.0/real\r\nkeyfinishParticleSize/key\r\nreal0.0/real\r\nkeyfinishParticleSizeVariance/key\r\nreal0.0/real\r\nkeygravityx/key\r\nreal0.0/real\r\nkeygravityy/key\r\nreal0.0/real\r\nkeymaxParticles/key\r\nreal50/real\r\nkeymaxRadius/key\r\nreal100/real\r\nkeymaxRadiusVariance/key\r\nreal0.0/real\r\nkeyminRadius/ke\r\nreal0.0/real\r\nkeyparticleLifespan/key\r\nreal0.0/real\r\nkeyparticleLifespanVariance/key\r\nreal1.5/real\r\nkeyradialAccelVariance/key\r\nreal0.0/real\r\nkeyradialAcceleration/key\r\nreal0.0/real\r\nkeyrotatePerSecond/key\r\nreal0.0/real\r\nkeyrotatePerSecondVariance/key\r\nreal0.0/real\r\nkeyrotationEnd/key\r\nreal0.0/real\r\nkeyrotationEndVariance/key\r\nreal0.0/real\r\nkeyrotationStart/key\r\nreal0.0/real\r\nkeyrotationStartVariance/key\r\nreal0.0/real\r\nkeysourcePositionVariancex/key\r\nreal46/real\r\nkeysourcePositionVariancey/key\r\nreal0.0/real\r\nkeysourcePositionx/key\r\nreal240.65878295898438/real\r\nkeysourcePositiony/key\r\nreal162.94760131835938/real\r\nkeyspeed/key\r\nreal40/real\r\nkeyspeedVariance/key\r\nreal15/real\r\nkeystartColorAlpha/key\r\nreal0.5/real\r\nkeystartColorBlue/key\r\nreal1/real\r\nkeystartColorGreen/key\r\nreal1/real\r\nkeystartColorRed/key\r\nreal1/real\r\nkeystartColorVarianceAlpha/key\r\nreal0.5/real\r\nkeystartColorVarianceBlue/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceGreen/key\r\nreal0.10000000149011612/real\r\nkeystartColorVarianceRed/key\r\nreal0.10000000149011612/real\r\nkeystartParticleSize/key\r\nreal4/real\r\nkeystartParticleSizeVariance/key\r\nreal1/real\r\nkeytangentialAccelVariance/key\r\nreal0.0/real\r\nkeytangentialAcceleration/key\r\nreal0.0/real\r\nkeytextureFileName/key\r\nstringsquare.png/string\r\n/dict\r\n/plist\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "Content-Type",
          "value": "application/xml"
        }
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776382073997,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_947dad3e479f4de990c2a5e04f7d8c10",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281697,
      "created": 1776375281697,
      "url": "https://{{host}}/echo/put",
      "name": "NativeRest Echo PUT",
      "description": "",
      "method": "PUT",
      "body": {
        "mimeType": "application/json",
        "text": "{\r\n  \"totalCores\": 36, \r\n}\r\n"
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "User-Agent",
          "value": "Mozilla/5.0"
        },
        {
          "name": "Accept",
          "value": "json"
        }
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776375281697,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_ab8181296bba4cad9188039dff1d251f",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281695,
      "created": 1776375281695,
      "url": "https://{{host}}/echo/post",
      "name": "NativeRest Echo POST",
      "description": "",
      "method": "POST",
      "body": {
        "mimeType": "application/json",
        "text": "{\r\n  \"processorName\": \"i9-13900\", \r\n  \"totalCores\": 24,\r\n  \"frequency\": \"{{frequency}}\",\r\n  \"cache\": \"36 MB\",\r\n  \"launchDate\": \"{{date.isoDate}}\"\r\n}\r\n"
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "Content-Type",
          "value": "application/json"
        },
        {
          "name": "User-Agent",
          "value": "Mozilla/5.0"
        },
        {
          "name": "Accept",
          "value": "json"
        }
      ],
      "authentication": {
        "type": "basic",
        "username": "username",
        "password": "password"
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776375281695,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_b8238a14dfe44efea2e1dd7a477bf65a",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776382159455,
      "created": 1776382159455,
      "url": "?@55355335355353535353",
      "name": "New Request 4",
      "description": "",
      "method": "GET",
      "body": {
        "mimeType": "application/json",
        "text": "info face=\"Pusab\" size=128 bold=0 italic=0 charset=\"\" unicode=0 stretchH=100 smooth=1 aa=1 padding=0,0,0,0 spacing=1,1\r\ncommon lineHeight=130 base=78 scaleW=1024 scaleH=1024 pages=1 packed=0\r\npage id=0 file=\"bigFont-uhd.png\"\r\nchars count=96\r\nchar id=32     x=438   y=838   width=0     height=0     xoffset=0     yoffset=126   xadvance=60    page=0 chnl=0 letter=\"space\"\r\nchar id=33     x=102   y=132   width=62    height=107   xoffset=-0    yoffset=23    xadvance=48    page=0 chnl=0 letter=\"!\"\r\nchar id=34     x=90    y=838   width=69    height=51    xoffset=-0    yoffset=7     xadvance=54    page=0 chnl=0 letter=\"\"\"\r\nchar id=35     x=535   y=745   width=108   height=63    xoffset=-0    yoffset=22    xadvance=93    page=0 chnl=0 letter=\"#\"\r\nchar id=36     x=348   y=1     width=100   height=125   xoffset=-0    yoffset=11    xadvance=85    page=0 chnl=0 letter=\"$\"\r\nchar id=37     x=718   y=1     width=122   height=110   xoffset=-0    yoffset=19    xadvance=107   page=0 chnl=0 letter=\"%\"\r\nchar id=38     x=1     y=240   width=108   height=105   xoffset=-0    yoffset=22    xadvance=94    page=0 chnl=0 letter=\"&\"\r\nchar id=39     x=160   y=838   width=42    height=51    xoffset=-0    yoffset=7     xadvance=28    page=0 chnl=0 letter=\"'\"\r\nchar id=40     x=236   y=1     width=55    height=129   xoffset=-0    yoffset=9     xadvance=41    page=0 chnl=0 letter=\"(\"\r\nchar id=41     x=292   y=1     width=55    height=129   xoffset=-0    yoffset=9     xadvance=41    page=0 chnl=0 letter=\")\"\r\nchar id=42     x=813   y=745   width=56    height=54    xoffset=0     yoffset=5     xadvance=42    page=0 chnl=0 letter=\"*\"\r\nchar id=43     x=314   y=745   width=78    height=78    xoffset=-0    yoffset=41    xadvance=64    page=0 chnl=0 letter=\"+\"\r\nchar id=44     x=766   y=745   width=46    height=55    xoffset=-0    yoffset=82    xadvance=31    page=0 chnl=0 letter=\",\"\r\nchar id=45     x=326   y=838   width=66    height=40    xoffset=-0    yoffset=60    xadvance=51    page=0 chnl=0 letter=\"-\"\r\nchar id=46     x=203   y=838   width=43    height=43    xoffset=-0    yoffset=85    xadvance=29    page=0 chnl=0 letter=\".\"\r\nchar id=47     x=937   y=1     width=66    height=108   xoffset=0     yoffset=21    xadvance=53    page=0 chnl=0 letter=\"/\"\r\nchar id=48     x=688   y=132   width=98    height=106   xoffset=-0    yoffset=22    xadvance=84    page=0 chnl=0 letter=\"0\"\r\nchar id=49     x=780   y=450   width=81    height=103   xoffset=-0    yoffset=24    xadvance=66    page=0 chnl=0 letter=\"1\"\r\nchar id=50     x=735   y=240   width=97    height=104   xoffset=-0    yoffset=23    xadvance=83    page=0 chnl=0 letter=\"2\"\r\nchar id=51     x=787   y=132   width=97    height=106   xoffset=-0    yoffset=22    xadvance=82    page=0 chnl=0 letter=\"3\"\r\nchar id=52     x=225   y=346   width=108   height=103   xoffset=-0    yoffset=24    xadvance=94    page=0 chnl=0 letter=\"4\"\r\nchar id=53     x=110   y=240   width=94    height=105   xoffset=-0    yoffset=22    xadvance=80    page=0 chnl=0 letter=\"5\"\r\nchar id=54     x=488   y=132   width=99    height=106   xoffset=-0    yoffset=22    xadvance=85    page=0 chnl=0 letter=\"6\"\r\nchar id=55     x=304   y=450   width=96    height=103   xoffset=-0    yoffset=24    xadvance=82    page=0 chnl=0 letter=\"7\"\r\nchar id=56     x=205   y=240   width=92    height=105   xoffset=-0    yoffset=23    xadvance=78    page=0 chnl=0 letter=\"8\"\r\nchar id=57     x=588   y=132   width=99    height=106   xoffset=-0    yoffset=22    xadvance=84    page=0 chnl=0 letter=\"9\"\r\nchar id=58     x=382   y=554   width=46    height=95    xoffset=-0    yoffset=33    xadvance=31    page=0 chnl=0 letter=\":\"\r\nchar id=59     x=909   y=240   width=46    height=104   xoffset=-0    yoffset=33    xadvance=31    page=0 chnl=0 letter=\";\"\r\nchar id=60     x=393   y=745   width=70    height=75    xoffset=-0    yoffset=43    xadvance=55    page=0 chnl=0 letter=\"<\"\r\nchar id=61     x=703   y=745   width=62    height=56    xoffset=-0    yoffset=52    xadvance=47    page=0 chnl=0 letter=\"=\"\r\nchar id=62     x=464   y=745   width=70    height=75    xoffset=-0    yoffset=43    xadvance=55    page=0 chnl=0 letter=\">\"\r\nchar id=63     x=841   y=1     width=95    height=108   xoffset=-0    yoffset=22    xadvance=81    page=0 chnl=0 letter=\"?\"\r\nchar id=64     x=490   y=1     width=118   height=122   xoffset=-0    yoffset=13    xadvance=103   page=0 chnl=0 letter=\"@\"\r\nchar id=65     x=413   y=240   width=109   height=104   xoffset=-0    yoffset=23    xadvance=95    page=0 chnl=0 letter=\"A\"\r\nchar id=66     x=863   y=346   width=101   height=103   xoffset=-0    yoffset=24    xadvance=87    page=0 chnl=0 letter=\"B\"\r\nchar id=67     x=274   y=132   width=106   height=106   xoffset=-0    yoffset=22    xadvance=92    page=0 chnl=0 letter=\"C\"\r\nchar id=68     x=103   y=450   width=100   height=103   xoffset=-0    yoffset=24    xadvance=85    page=0 chnl=0 letter=\"D\"\r\nchar id=69     x=401   y=450   width=95    height=103   xoffset=-0    yoffset=24    xadvance=81    page=0 chnl=0 letter=\"E\"\r\nchar id=70     x=593   y=450   width=94    height=103   xoffset=-0    yoffset=24    xadvance=80    page=0 chnl=0 letter=\"F\"\r\nchar id=71     x=381   y=132   width=106   height=106   xoffset=-0    yoffset=22    xadvance=91    page=0 chnl=0 letter=\"G\"\r\nchar id=72     x=116   y=346   width=108   height=103   xoffset=-0    yoffset=24    xadvance=93    page=0 chnl=0 letter=\"H\"\r\nchar id=73     x=862   y=450   width=62    height=103   xoffset=-0    yoffset=24    xadvance=47    page=0 chnl=0 letter=\"I\"\r\nchar id=74     x=833   y=240   width=75    height=104   xoffset=-0    yoffset=24    xadvance=60    page=0 chnl=0 letter=\"J\"\r\nchar id=75     x=759   y=346   width=103   height=103   xoffset=-0    yoffset=24    xadvance=89    page=0 chnl=0 letter=\"K\"\r\nchar id=76     x=688   y=450   width=91    height=103   xoffset=-0    yoffset=24    xadvance=77    page=0 chnl=0 letter=\"L\"\r\nchar id=77     x=1     y=346   width=114   height=103   xoffset=-0    yoffset=24    xadvance=100   page=0 chnl=0 letter=\"M\"\r\nchar id=78     x=204   y=450   width=99    height=103   xoffset=-0    yoffset=24    xadvance=84    page=0 chnl=0 letter=\"N\"\r\nchar id=79     x=165   y=132   width=108   height=106   xoffset=-0    yoffset=22    xadvance=93    page=0 chnl=0 letter=\"O\"\r\nchar id=80     x=549   y=346   width=104   height=103   xoffset=-0    yoffset=24    xadvance=90    page=0 chnl=0 letter=\"P\"\r\nchar id=81     x=609   y=1     width=108   height=111   xoffset=-0    yoffset=23    xadvance=93    page=0 chnl=0 letter=\"Q\"\r\nchar id=82     x=654   y=346   width=104   height=103   xoffset=-0    yoffset=24    xadvance=90    page=0 chnl=0 letter=\"R\"\r\nchar id=83     x=1     y=132   width=100   height=107   xoffset=-0    yoffset=21    xadvance=85    page=0 chnl=0 letter=\"S\"\r\nchar id=84     x=1     y=450   width=101   height=103   xoffset=-0    yoffset=24    xadvance=87    page=0 chnl=0 letter=\"T\"\r\nchar id=85     x=631   y=240   width=103   height=104   xoffset=-0    yoffset=24    xadvance=89    page=0 chnl=0 letter=\"U\"\r\nchar id=86     x=334   y=346   width=107   height=103   xoffset=-0    yoffset=24    xadvance=92    page=0 chnl=0 letter=\"V\"\r\nchar id=87     x=298   y=240   width=114   height=104   xoffset=-0    yoffset=23    xadvance=100   page=0 chnl=0 letter=\"W\"\r\nchar id=88     x=523   y=240   width=107   height=104   xoffset=-0    yoffset=24    xadvance=92    page=0 chnl=0 letter=\"X\"\r\nchar id=89     x=442   y=346   width=106   height=103   xoffset=-0    yoffset=24    xadvance=91    page=0 chnl=0 letter=\"Y\"\r\nchar id=90     x=497   y=450   width=95    height=103   xoffset=-0    yoffset=24    xadvance=81    page=0 chnl=0 letter=\"Z\"\r\nchar id=91     x=176   y=1     width=59    height=129   xoffset=-0    yoffset=9     xadvance=45    page=0 chnl=0 letter=\"[\"\r\nchar id=92     x=885   y=132   width=67    height=106   xoffset=-0    yoffset=22    xadvance=53    page=0 chnl=0 letter=\"\\\"\r\nchar id=93     x=115   y=1     width=60    height=129   xoffset=-0    yoffset=9     xadvance=45    page=0 chnl=0 letter=\"]\"\r\nchar id=94     x=870   y=745   width=68    height=52    xoffset=-0    yoffset=6     xadvance=53    page=0 chnl=0 letter=\"^\"\r\nchar id=95     x=247   y=838   width=78    height=40    xoffset=-0    yoffset=105   xadvance=64    page=0 chnl=0 letter=\"_\"\r\nchar id=96     x=393   y=838   width=44    height=38    xoffset=-0    yoffset=0     xadvance=30    page=0 chnl=0 letter=\"`\"\r\nchar id=97     x=533   y=554   width=98    height=93    xoffset=-0    yoffset=34    xadvance=83    page=0 chnl=0 letter=\"a\"\r\nchar id=98     x=733   y=651   width=91    height=92    xoffset=-0    yoffset=35    xadvance=76    page=0 chnl=0 letter=\"b\"\r\nchar id=99     x=190   y=554   width=95    height=95    xoffset=-0    yoffset=33    xadvance=81    page=0 chnl=0 letter=\"c\"\r\nchar id=100    x=917   y=651   width=90    height=92    xoffset=-0    yoffset=35    xadvance=75    page=0 chnl=0 letter=\"d\"\r\nchar id=101    x=1     y=745   width=86    height=92    xoffset=-0    yoffset=35    xadvance=71    page=0 chnl=0 letter=\"e\"\r\nchar id=102    x=88    y=745   width=85    height=92    xoffset=-0    yoffset=35    xadvance=70    page=0 chnl=0 letter=\"f\"\r\nchar id=103    x=286   y=554   width=95    height=95    xoffset=-0    yoffset=33    xadvance=80    page=0 chnl=0 letter=\"g\"\r\nchar id=104    x=444   y=651   width=97    height=92    xoffset=-0    yoffset=35    xadvance=83    page=0 chnl=0 letter=\"h\"\r\nchar id=105    x=257   y=745   width=56    height=92    xoffset=-0    yoffset=35    xadvance=42    page=0 chnl=0 letter=\"i\"\r\nchar id=106    x=272   y=651   width=68    height=93    xoffset=-0    yoffset=35    xadvance=53    page=0 chnl=0 letter=\"j\"\r\nchar id=107    x=921   y=554   width=93    height=93    xoffset=-0    yoffset=34    xadvance=78    page=0 chnl=0 letter=\"k\"\r\nchar id=108    x=174   y=745   width=82    height=92    xoffset=-0    yoffset=35    xadvance=68    page=0 chnl=0 letter=\"l\"\r\nchar id=109    x=341   y=651   width=102   height=92    xoffset=-0    yoffset=35    xadvance=88    page=0 chnl=0 letter=\"m\"\r\nchar id=110    x=95    y=651   width=89    height=93    xoffset=-0    yoffset=34    xadvance=74    page=0 chnl=0 letter=\"n\"\r\nchar id=111    x=92    y=554   width=97    height=95    xoffset=-0    yoffset=33    xadvance=82    page=0 chnl=0 letter=\"o\"\r\nchar id=112    x=638   y=651   width=94    height=92    xoffset=-0    yoffset=35    xadvance=79    page=0 chnl=0 letter=\"p\"\r\nchar id=113    x=925   y=450   width=97    height=100   xoffset=-0    yoffset=33    xadvance=82    page=0 chnl=0 letter=\"q\"\r\nchar id=114    x=826   y=554   width=94    height=93    xoffset=-0    yoffset=34    xadvance=79    page=0 chnl=0 letter=\"r\"\r\nchar id=115    x=1     y=554   width=90    height=96    xoffset=-0    yoffset=32    xadvance=75    page=0 chnl=0 letter=\"s\"\r\nchar id=116    x=825   y=651   width=91    height=92    xoffset=-0    yoffset=35    xadvance=77    page=0 chnl=0 letter=\"t\"\r\nchar id=117    x=1     y=651   width=93    height=93    xoffset=-0    yoffset=35    xadvance=78    page=0 chnl=0 letter=\"u\"\r\nchar id=118    x=632   y=554   width=96    height=93    xoffset=-0    yoffset=34    xadvance=81    page=0 chnl=0 letter=\"v\"\r\nchar id=119    x=429   y=554   width=103   height=93    xoffset=-0    yoffset=34    xadvance=88    page=0 chnl=0 letter=\"w\"\r\nchar id=120    x=729   y=554   width=96    height=93    xoffset=-0    yoffset=34    xadvance=81    page=0 chnl=0 letter=\"x\"\r\nchar id=121    x=542   y=651   width=95    height=92    xoffset=-0    yoffset=35    xadvance=80    page=0 chnl=0 letter=\"y\"\r\nchar id=122    x=185   y=651   width=86    height=93    xoffset=-0    yoffset=34    xadvance=71    page=0 chnl=0 letter=\"z\"\r\nchar id=123    x=1     y=1     width=56    height=130   xoffset=-0    yoffset=9     xadvance=42    page=0 chnl=0 letter=\"{\"\r\nchar id=124    x=449   y=1     width=40    height=125   xoffset=-0    yoffset=11    xadvance=26    page=0 chnl=0 letter=\"|\"\r\nchar id=125    x=58    y=1     width=56    height=130   xoffset=-0    yoffset=9     xadvance=42    page=0 chnl=0 letter=\"}\"\r\nchar id=126    x=1     y=838   width=88    height=51    xoffset=-0    yoffset=7     xadvance=73    page=0 chnl=0 letter=\"~\"\r\nchar id=8226   x=644   y=745   width=58    height=58    xoffset=-0    yoffset=52    xadvance=44    page=0 chnl=0 letter=\"•\"\r\nkernings count=506\r\nkerning first=47 second=47 amount=-12\r\nkerning first=65 second=67 amount=-5\r\nkerning first=65 second=71 amount=-5\r\nkerning first=65 second=79 amount=-5\r\nkerning first=65 second=81 amount=-5\r\nkerning first=65 second=84 amount=-17\r\nkerning first=65 second=85 amount=-5\r\nkerning first=65 second=86 amount=-18\r\nkerning first=65 second=87 amount=-8\r\nkerning first=65 second=89 amount=-21\r\nkerning first=65 second=99 amount=-3\r\nkerning first=65 second=103 amount=-3\r\nkerning first=65 second=111 amount=-3\r\nkerning first=65 second=113 amount=-3\r\nkerning first=65 second=116 amount=-14\r\nkerning first=65 second=117 amount=-3\r\nkerning first=65 second=118 amount=-14\r\nkerning first=65 second=119 amount=-7\r\nkerning first=65 second=121 amount=-17\r\nkerning first=66 second=74 amount=-3\r\nkerning first=66 second=84 amount=-3\r\nkerning first=66 second=86 amount=-3\r\nkerning first=66 second=88 amount=-4\r\nkerning first=66 second=89 amount=-5\r\nkerning first=66 second=105 amount=3\r\nkerning first=66 second=106 amount=-3\r\nkerning first=67 second=65 amount=-6\r\nkerning first=67 second=74 amount=-8\r\nkerning first=67 second=84 amount=-5\r\nkerning first=67 second=86 amount=-5\r\nkerning first=67 second=87 amount=-3\r\nkerning first=67 second=88 amount=-7\r\nkerning first=67 second=89 amount=-7\r\nkerning first=67 second=90 amount=-3\r\nkerning first=67 second=97 amount=-6\r\nkerning first=67 second=106 amount=-9\r\nkerning first=67 second=120 amount=-3\r\nkerning first=67 second=121 amount=-4\r\nkerning first=68 second=65 amount=-6\r\nkerning first=68 second=74 amount=-10\r\nkerning first=68 second=84 amount=-6\r\nkerning first=68 second=86 amount=-6\r\nkerning first=68 second=87 amount=-3\r\nkerning first=68 second=88 amount=-9\r\nkerning first=68 second=89 amount=-9\r\nkerning first=68 second=90 amount=-4\r\nkerning first=68 second=97 amount=-6\r\nkerning first=68 second=106 amount=-9\r\nkerning first=68 second=120 amount=-4\r\nkerning first=68 second=121 amount=-5\r\nkerning first=69 second=67 amount=-3\r\nkerning first=69 second=71 amount=-3\r\nkerning first=69 second=79 amount=-3\r\nkerning first=69 second=81 amount=-3\r\nkerning first=70 second=65 amount=-14\r\nkerning first=70 second=67 amount=-5\r\nkerning first=70 second=71 amount=-5\r\nkerning first=70 second=74 amount=-13\r\nkerning first=70 second=77 amount=-5\r\nkerning first=70 second=79 amount=-5\r\nkerning first=70 second=81 amount=-5\r\nkerning first=70 second=83 amount=-3\r\nkerning first=70 second=89 amount=-3\r\nkerning first=70 second=97 amount=-14\r\nkerning first=70 second=99 amount=-7\r\nkerning first=70 second=103 amount=-7\r\nkerning first=70 second=106 amount=-12\r\nkerning first=70 second=109 amount=-6\r\nkerning first=70 second=111 amount=-7\r\nkerning first=70 second=113 amount=-7\r\nkerning first=70 second=115 amount=-5\r\nkerning first=70 second=116 amount=-3\r\nkerning first=70 second=121 amount=-3\r\nkerning first=71 second=84 amount=-4\r\nkerning first=71 second=86 amount=-3\r\nkerning first=71 second=89 amount=-6\r\nkerning first=72 second=66 amount=3\r\nkerning first=72 second=68 amount=3\r\nkerning first=72 second=69 amount=3\r\nkerning first=72 second=70 amount=3\r\nkerning first=72 second=72 amount=3\r\nkerning first=72 second=73 amount=3\r\nkerning first=72 second=75 amount=3\r\nkerning first=72 second=76 amount=3\r\nkerning first=72 second=78 amount=3\r\nkerning first=72 second=80 amount=3\r\nkerning first=72 second=82 amount=3\r\nkerning first=72 second=98 amount=3\r\nkerning first=72 second=100 amount=3\r\nkerning first=72 second=101 amount=3\r\nkerning first=72 second=102 amount=3\r\nkerning first=72 second=104 amount=3\r\nkerning first=72 second=105 amount=3\r\nkerning first=72 second=107 amount=3\r\nkerning first=72 second=108 amount=3\r\nkerning first=72 second=109 amount=3\r\nkerning first=72 second=110 amount=3\r\nkerning first=72 second=112 amount=3\r\nkerning first=72 second=114 amount=3\r\nkerning first=72 second=117 amount=3\r\nkerning first=73 second=66 amount=3\r\nkerning first=73 second=68 amount=3\r\nkerning first=73 second=69 amount=3\r\nkerning first=73 second=70 amount=3\r\nkerning first=73 second=72 amount=3\r\nkerning first=73 second=73 amount=3\r\nkerning first=73 second=75 amount=3\r\nkerning first=73 second=76 amount=3\r\nkerning first=73 second=78 amount=3\r\nkerning first=73 second=80 amount=3\r\nkerning first=73 second=82 amount=3\r\nkerning first=73 second=98 amount=3\r\nkerning first=73 second=100 amount=3\r\nkerning first=73 second=101 amount=3\r\nkerning first=73 second=102 amount=3\r\nkerning first=73 second=104 amount=3\r\nkerning first=73 second=105 amount=3\r\nkerning first=73 second=107 amount=3\r\nkerning first=73 second=108 amount=3\r\nkerning first=73 second=110 amount=3\r\nkerning first=73 second=112 amount=3\r\nkerning first=73 second=114 amount=3\r\nkerning first=74 second=65 amount=-6\r\nkerning first=74 second=74 amount=-10\r\nkerning first=74 second=97 amount=-7\r\nkerning first=74 second=106 amount=-9\r\nkerning first=75 second=67 amount=-4\r\nkerning first=75 second=71 amount=-4\r\nkerning first=75 second=79 amount=-4\r\nkerning first=75 second=81 amount=-4\r\nkerning first=75 second=84 amount=-3\r\nkerning first=75 second=85 amount=-3\r\nkerning first=75 second=86 amount=-3\r\nkerning first=75 second=89 amount=-3\r\nkerning first=75 second=99 amount=-3\r\nkerning first=75 second=103 amount=-3\r\nkerning first=75 second=111 amount=-3\r\nkerning first=75 second=113 amount=-3\r\nkerning first=75 second=116 amount=-5\r\nkerning first=75 second=117 amount=-3\r\nkerning first=75 second=118 amount=-5\r\nkerning first=75 second=119 amount=-4\r\nkerning first=75 second=121 amount=-5\r\nkerning first=76 second=65 amount=-3\r\nkerning first=76 second=67 amount=-6\r\nkerning first=76 second=71 amount=-6\r\nkerning first=76 second=74 amount=-3\r\nkerning first=76 second=79 amount=-6\r\nkerning first=76 second=81 amount=-6\r\nkerning first=76 second=84 amount=-18\r\nkerning first=76 second=85 amount=-7\r\nkerning first=76 second=86 amount=-21\r\nkerning first=76 second=87 amount=-9\r\nkerning first=76 second=88 amount=-4\r\nkerning first=76 second=89 amount=-23\r\nkerning first=76 second=97 amount=-3\r\nkerning first=76 second=99 amount=-4\r\nkerning first=76 second=103 amount=-4\r\nkerning first=76 second=111 amount=-4\r\nkerning first=76 second=113 amount=-4\r\nkerning first=76 second=116 amount=-15\r\nkerning first=76 second=117 amount=-5\r\nkerning first=76 second=118 amount=-17\r\nkerning first=76 second=119 amount=-8\r\nkerning first=76 second=120 amount=-4\r\nkerning first=76 second=121 amount=-19\r\nkerning first=77 second=84 amount=-7\r\nkerning first=77 second=86 amount=-7\r\nkerning first=77 second=87 amount=-5\r\nkerning first=77 second=89 amount=-8\r\nkerning first=77 second=116 amount=-4\r\nkerning first=77 second=118 amount=-4\r\nkerning first=77 second=119 amount=-4\r\nkerning first=77 second=121 amount=-5\r\nkerning first=78 second=66 amount=3\r\nkerning first=78 second=68 amount=3\r\nkerning first=78 second=69 amount=3\r\nkerning first=78 second=70 amount=3\r\nkerning first=78 second=72 amount=3\r\nkerning first=78 second=73 amount=3\r\nkerning first=78 second=75 amount=3\r\nkerning first=78 second=76 amount=3\r\nkerning first=78 second=77 amount=3\r\nkerning first=78 second=78 amount=3\r\nkerning first=78 second=80 amount=3\r\nkerning first=78 second=82 amount=3\r\nkerning first=78 second=98 amount=3\r\nkerning first=78 second=100 amount=3\r\nkerning first=78 second=101 amount=3\r\nkerning first=78 second=102 amount=3\r\nkerning first=78 second=104 amount=3\r\nkerning first=78 second=105 amount=3\r\nkerning first=78 second=107 amount=3\r\nkerning first=78 second=108 amount=3\r\nkerning first=78 second=109 amount=3\r\nkerning first=78 second=110 amount=3\r\nkerning first=78 second=112 amount=3\r\nkerning first=78 second=114 amount=3\r\nkerning first=78 second=117 amount=3\r\nkerning first=79 second=65 amount=-6\r\nkerning first=79 second=74 amount=-8\r\nkerning first=79 second=84 amount=-5\r\nkerning first=79 second=86 amount=-5\r\nkerning first=79 second=88 amount=-7\r\nkerning first=79 second=89 amount=-8\r\nkerning first=79 second=90 amount=-3\r\nkerning first=79 second=97 amount=-5\r\nkerning first=79 second=106 amount=-8\r\nkerning first=79 second=120 amount=-3\r\nkerning first=79 second=121 amount=-4\r\nkerning first=80 second=65 amount=-13\r\nkerning first=80 second=74 amount=-13\r\nkerning first=80 second=77 amount=-3\r\nkerning first=80 second=84 amount=-4\r\nkerning first=80 second=86 amount=-4\r\nkerning first=80 second=87 amount=-3\r\nkerning first=80 second=88 amount=-5\r\nkerning first=80 second=89 amount=-6\r\nkerning first=80 second=90 amount=-3\r\nkerning first=80 second=97 amount=-13\r\nkerning first=80 second=106 amount=-12\r\nkerning first=80 second=109 amount=-4\r\nkerning first=80 second=116 amount=-3\r\nkerning first=80 second=118 amount=-3\r\nkerning first=80 second=121 amount=-3\r\nkerning first=81 second=65 amount=-5\r\nkerning first=81 second=74 amount=-6\r\nkerning first=81 second=84 amount=-5\r\nkerning first=81 second=86 amount=-5\r\nkerning first=81 second=88 amount=-6\r\nkerning first=81 second=89 amount=-8\r\nkerning first=81 second=90 amount=-3\r\nkerning first=81 second=97 amount=-5\r\nkerning first=81 second=100 amount=3\r\nkerning first=81 second=104 amount=3\r\nkerning first=81 second=105 amount=3\r\nkerning first=81 second=106 amount=-5\r\nkerning first=81 second=107 amount=3\r\nkerning first=81 second=120 amount=-3\r\nkerning first=81 second=121 amount=-4\r\nkerning first=82 second=84 amount=-3\r\nkerning first=82 second=86 amount=-3\r\nkerning first=82 second=89 amount=-5\r\nkerning first=83 second=65 amount=-4\r\nkerning first=83 second=74 amount=-4\r\nkerning first=83 second=97 amount=-4\r\nkerning first=83 second=106 amount=-5\r\nkerning first=84 second=65 amount=-20\r\nkerning first=84 second=67 amount=-6\r\nkerning first=84 second=71 amount=-6\r\nkerning first=84 second=74 amount=-13\r\nkerning first=84 second=77 amount=-6\r\nkerning first=84 second=79 amount=-6\r\nkerning first=84 second=81 amount=-6\r\nkerning first=84 second=83 amount=-4\r\nkerning first=84 second=84 amount=-3\r\nkerning first=84 second=89 amount=-3\r\nkerning first=84 second=97 amount=-21\r\nkerning first=84 second=99 amount=-9\r\nkerning first=84 second=103 amount=-9\r\nkerning first=84 second=106 amount=-12\r\nkerning first=84 second=108 amount=-3\r\nkerning first=84 second=109 amount=-7\r\nkerning first=84 second=110 amount=-3\r\nkerning first=84 second=111 amount=-9\r\nkerning first=84 second=113 amount=-9\r\nkerning first=84 second=115 amount=-6\r\nkerning first=84 second=116 amount=-3\r\nkerning first=84 second=117 amount=-3\r\nkerning first=84 second=118 amount=-3\r\nkerning first=84 second=121 amount=-3\r\nkerning first=85 second=65 amount=-5\r\nkerning first=85 second=74 amount=-7\r\nkerning first=85 second=97 amount=-5\r\nkerning first=85 second=104 amount=3\r\nkerning first=85 second=105 amount=3\r\nkerning first=85 second=106 amount=-7\r\nkerning first=86 second=65 amount=-17\r\nkerning first=86 second=67 amount=-5\r\nkerning first=86 second=71 amount=-5\r\nkerning first=86 second=74 amount=-12\r\nkerning first=86 second=77 amount=-5\r\nkerning first=86 second=79 amount=-5\r\nkerning first=86 second=81 amount=-5\r\nkerning first=86 second=83 amount=-3\r\nkerning first=86 second=97 amount=-18\r\nkerning first=86 second=99 amount=-6\r\nkerning first=86 second=103 amount=-7\r\nkerning first=86 second=106 amount=-12\r\nkerning first=86 second=109 amount=-7\r\nkerning first=86 second=111 amount=-7\r\nkerning first=86 second=113 amount=-6\r\nkerning first=86 second=115 amount=-5\r\nkerning first=86 second=116 amount=-3\r\nkerning first=87 second=65 amount=-7\r\nkerning first=87 second=74 amount=-7\r\nkerning first=87 second=97 amount=-7\r\nkerning first=87 second=106 amount=-7\r\nkerning first=88 second=67 amount=-7\r\nkerning first=88 second=71 amount=-7\r\nkerning first=88 second=79 amount=-7\r\nkerning first=88 second=81 amount=-7\r\nkerning first=88 second=99 amount=-5\r\nkerning first=88 second=103 amount=-6\r\nkerning first=88 second=111 amount=-5\r\nkerning first=88 second=113 amount=-5\r\nkerning first=88 second=116 amount=-6\r\nkerning first=88 second=117 amount=-6\r\nkerning first=88 second=118 amount=-6\r\nkerning first=88 second=119 amount=-5\r\nkerning first=88 second=121 amount=-5\r\nkerning first=89 second=65 amount=-19\r\nkerning first=89 second=67 amount=-7\r\nkerning first=89 second=71 amount=-8\r\nkerning first=89 second=74 amount=-13\r\nkerning first=89 second=77 amount=-7\r\nkerning first=89 second=79 amount=-8\r\nkerning first=89 second=81 amount=-8\r\nkerning first=89 second=83 amount=-5\r\nkerning first=89 second=84 amount=-3\r\nkerning first=89 second=97 amount=-19\r\nkerning first=89 second=98 amount=-4\r\nkerning first=89 second=99 amount=-10\r\nkerning first=89 second=100 amount=-3\r\nkerning first=89 second=101 amount=-4\r\nkerning first=89 second=102 amount=-4\r\nkerning first=89 second=103 amount=-10\r\nkerning first=89 second=104 amount=-3\r\nkerning first=89 second=105 amount=-3\r\nkerning first=89 second=106 amount=-13\r\nkerning first=89 second=107 amount=-3\r\nkerning first=89 second=108 amount=-4\r\nkerning first=89 second=109 amount=-9\r\nkerning first=89 second=110 amount=-4\r\nkerning first=89 second=111 amount=-10\r\nkerning first=89 second=112 amount=-4\r\nkerning first=89 second=113 amount=-10\r\nkerning first=89 second=114 amount=-4\r\nkerning first=89 second=115 amount=-8\r\nkerning first=89 second=116 amount=-5\r\nkerning first=89 second=117 amount=-4\r\nkerning first=89 second=118 amount=-4\r\nkerning first=89 second=119 amount=-4\r\nkerning first=89 second=120 amount=-3\r\nkerning first=89 second=121 amount=-4\r\nkerning first=89 second=122 amount=-4\r\nkerning first=90 second=67 amount=-3\r\nkerning first=90 second=71 amount=-3\r\nkerning first=90 second=79 amount=-3\r\nkerning first=90 second=81 amount=-3\r\nkerning first=92 second=92 amount=-12\r\nkerning first=97 second=99 amount=-4\r\nkerning first=97 second=103 amount=-4\r\nkerning first=97 second=111 amount=-4\r\nkerning first=97 second=113 amount=-4\r\nkerning first=97 second=116 amount=-14\r\nkerning first=97 second=117 amount=-4\r\nkerning first=97 second=118 amount=-15\r\nkerning first=97 second=119 amount=-7\r\nkerning first=97 second=121 amount=-18\r\nkerning first=98 second=120 amount=-3\r\nkerning first=98 second=121 amount=-3\r\nkerning first=99 second=97 amount=-4\r\nkerning first=99 second=106 amount=-6\r\nkerning first=99 second=116 amount=-3\r\nkerning first=99 second=118 amount=-3\r\nkerning first=99 second=120 amount=-5\r\nkerning first=99 second=121 amount=-5\r\nkerning first=100 second=97 amount=-5\r\nkerning first=100 second=106 amount=-8\r\nkerning first=100 second=116 amount=-5\r\nkerning first=100 second=118 amount=-4\r\nkerning first=100 second=120 amount=-7\r\nkerning first=100 second=121 amount=-7\r\nkerning first=100 second=122 amount=-3\r\nkerning first=101 second=99 amount=-3\r\nkerning first=101 second=103 amount=-3\r\nkerning first=101 second=111 amount=-3\r\nkerning first=101 second=113 amount=-3\r\nkerning first=102 second=97 amount=-12\r\nkerning first=102 second=99 amount=-4\r\nkerning first=102 second=103 amount=-4\r\nkerning first=102 second=106 amount=-11\r\nkerning first=102 second=109 amount=-4\r\nkerning first=102 second=111 amount=-4\r\nkerning first=102 second=113 amount=-4\r\nkerning first=103 second=121 amount=-5\r\nkerning first=104 second=98 amount=3\r\nkerning first=104 second=100 amount=3\r\nkerning first=104 second=101 amount=3\r\nkerning first=104 second=102 amount=3\r\nkerning first=104 second=104 amount=3\r\nkerning first=104 second=105 amount=3\r\nkerning first=104 second=107 amount=3\r\nkerning first=104 second=108 amount=3\r\nkerning first=104 second=109 amount=3\r\nkerning first=104 second=110 amount=3\r\nkerning first=104 second=112 amount=3\r\nkerning first=104 second=114 amount=3\r\nkerning first=104 second=117 amount=3\r\nkerning first=105 second=98 amount=3\r\nkerning first=105 second=100 amount=3\r\nkerning first=105 second=101 amount=3\r\nkerning first=105 second=102 amount=3\r\nkerning first=105 second=104 amount=3\r\nkerning first=105 second=105 amount=3\r\nkerning first=105 second=107 amount=3\r\nkerning first=105 second=108 amount=3\r\nkerning first=105 second=110 amount=3\r\nkerning first=105 second=112 amount=3\r\nkerning first=105 second=114 amount=3\r\nkerning first=105 second=117 amount=3\r\nkerning first=106 second=97 amount=-5\r\nkerning first=106 second=106 amount=-8\r\nkerning first=107 second=99 amount=-3\r\nkerning first=107 second=103 amount=-3\r\nkerning first=107 second=111 amount=-3\r\nkerning first=107 second=113 amount=-3\r\nkerning first=108 second=99 amount=-4\r\nkerning first=108 second=103 amount=-4\r\nkerning first=108 second=111 amount=-4\r\nkerning first=108 second=113 amount=-4\r\nkerning first=108 second=116 amount=-15\r\nkerning first=108 second=117 amount=-5\r\nkerning first=108 second=118 amount=-18\r\nkerning first=108 second=119 amount=-8\r\nkerning first=108 second=120 amount=-3\r\nkerning first=108 second=121 amount=-19\r\nkerning first=109 second=116 amount=-5\r\nkerning first=109 second=118 amount=-5\r\nkerning first=109 second=119 amount=-4\r\nkerning first=109 second=121 amount=-7\r\nkerning first=110 second=98 amount=3\r\nkerning first=110 second=100 amount=3\r\nkerning first=110 second=101 amount=3\r\nkerning first=110 second=102 amount=3\r\nkerning first=110 second=104 amount=3\r\nkerning first=110 second=105 amount=3\r\nkerning first=110 second=107 amount=3\r\nkerning first=110 second=108 amount=3\r\nkerning first=110 second=110 amount=3\r\nkerning first=110 second=112 amount=3\r\nkerning first=110 second=114 amount=3\r\nkerning first=110 second=117 amount=3\r\nkerning first=111 second=97 amount=-4\r\nkerning first=111 second=106 amount=-7\r\nkerning first=111 second=116 amount=-4\r\nkerning first=111 second=118 amount=-3\r\nkerning first=111 second=120 amount=-6\r\nkerning first=111 second=121 amount=-6\r\nkerning first=112 second=97 amount=-11\r\nkerning first=112 second=106 amount=-11\r\nkerning first=112 second=116 amount=-3\r\nkerning first=112 second=118 amount=-3\r\nkerning first=112 second=120 amount=-4\r\nkerning first=112 second=121 amount=-5\r\nkerning first=113 second=97 amount=-4\r\nkerning first=113 second=106 amount=-5\r\nkerning first=113 second=116 amount=-4\r\nkerning first=113 second=118 amount=-3\r\nkerning first=113 second=120 amount=-5\r\nkerning first=113 second=121 amount=-6\r\nkerning first=114 second=121 amount=-4\r\nkerning first=115 second=97 amount=-3\r\nkerning first=115 second=106 amount=-4\r\nkerning first=116 second=97 amount=-17\r\nkerning first=116 second=99 amount=-4\r\nkerning first=116 second=103 amount=-4\r\nkerning first=116 second=106 amount=-11\r\nkerning first=116 second=109 amount=-4\r\nkerning first=116 second=111 amount=-4\r\nkerning first=116 second=113 amount=-4\r\nkerning first=117 second=97 amount=-4\r\nkerning first=117 second=98 amount=3\r\nkerning first=117 second=100 amount=3\r\nkerning first=117 second=101 amount=3\r\nkerning first=117 second=102 amount=3\r\nkerning first=117 second=104 amount=3\r\nkerning first=117 second=105 amount=3\r\nkerning first=117 second=106 amount=-5\r\nkerning first=117 second=107 amount=3\r\nkerning first=117 second=108 amount=3\r\nkerning first=117 second=110 amount=3\r\nkerning first=117 second=112 amount=3\r\nkerning first=117 second=114 amount=3\r\nkerning first=118 second=97 amount=-14\r\nkerning first=118 second=99 amount=-3\r\nkerning first=118 second=103 amount=-3\r\nkerning first=118 second=106 amount=-10\r\nkerning first=118 second=109 amount=-4\r\nkerning first=118 second=111 amount=-3\r\nkerning first=118 second=113 amount=-3\r\nkerning first=119 second=97 amount=-6\r\nkerning first=119 second=106 amount=-6\r\nkerning first=120 second=99 amount=-6\r\nkerning first=120 second=103 amount=-6\r\nkerning first=120 second=111 amount=-6\r\nkerning first=120 second=113 amount=-6\r\nkerning first=121 second=97 amount=-16\r\nkerning first=121 second=99 amount=-6\r\nkerning first=121 second=103 amount=-6\r\nkerning first=121 second=106 amount=-10\r\nkerning first=121 second=109 amount=-5\r\nkerning first=121 second=111 amount=-6\r\nkerning first=121 second=113 amount=-6\r\nkerning first=121 second=115 amount=-4\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n"
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "Content-Type",
          "value": "application/json"
        }
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776382159455,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_c2a5b0bb16c346409b12f438c63780ae",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281697,
      "created": 1776375281697,
      "url": "https://{{host}}/echo/get?segment=desktop&processorName=i9-13900",
      "name": "NativeRest Echo GET",
      "description": "",
      "method": "GET",
      "body": {
        "mimeType": "application/json",
        "text": ""
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "User-Agent",
          "value": "Mozilla/5.0"
        },
        {
          "name": "Accept",
          "value": "json"
        }
      ],
      "authentication": {
        "type": "basic",
        "username": "username",
        "password": "password"
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776375281697,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_dae0971016564146ab9ff868068e1461",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776384524501,
      "created": 1776384524501,
      "url": "?83823848281238171",
      "name": "New Request 5",
      "description": "",
      "method": "GET",
      "body": {
        "mimeType": "application/json",
        "text": ""
      },
      "parameters": [
      ],
      "headers": [
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776384524501,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    },
    {
      "_id": "req_e618d0e3538c417d95575b2679fa8325",
      "parentId": "wrk_f7517ad3bc1a4755954707826257c5b9",
      "modified": 1776375281698,
      "created": 1776375281698,
      "url": "https://{{host}}/echo/delete??xml version=1.0 encoding=UTF-8?&!DOCTYPE plist PUBLIC -//Apple Computer//DTD PLIST 1.0//EN http://www.apple.com/DTDs/PropertyList-1.0.dtd&plist version=1.0&dict&keyframes/key&dict&keycolourPicker.png/key&dict&keyframe/key&string{{176,1},{13,13}}/string&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{13,13}}/string&string{13,13}/string&/dict&keycolourPickerBackground.png/key&dict&keyframe/key&string{{1,461},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerOverlay.png/key&dict&keyframe/key&string{{85,319},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keycolourPickerShadow.png/key&dict&keyframe/key&string{{112,430},{110,110}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{110,110}}/string&keysourceSize/key&string{110,110}/string&/dict&keyhueBar.png/key&dict&keyframe/key&keyframe/key&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&string{20,292}/string&/dict&keyhuePickerBackground.png/key&dict&keyframe/key&string{{85,168},{150,150}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{150,150}}/string&/dict&keylightnessBar.png/key&dict&keyframe/key&string{{22,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keymenuCircleWhite.png/key&dict&keyframe/key&string{{112,541},{30,30}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{30,30}}/string&keysourceSize/key&string{30,30}/string&/dict&keymenuColourPanelBackground.png/key&dict&keyframe/key&string{{1,1},{174,166}}/string&keyoffset/key&string{3,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{6,0},{174,166}}/string&keysourceSize/key&string{180,166}/string&/dict&keysaturationBarBottom.png/key&dict&keyframe/key&string{{43,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&keysaturationBarTop.png/key&dict&keyframe/key&string{{64,168},{20,292}}/string&keyoffset/key&string{0,0}/string&keyrotated/key&false/&keysourceColorRect/key&string{{0,0},{20,292}}/string&keysourceSize/key&string{20,292}/string&/dict&/dict&keymetadata/key&dict&keyformat/key&integer2/integer&keyrealTextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&keysize/key&string{236,572}/string&keysmartupdate/key&string$TexturePacker:SmartUpdate:daa2656ba65391e1afccbc64ef4ed72f:d071bcbdaa932f2d637c8cec8d9f7fa2:0dfe3216bd36d3c9fec1891e9c7a586f$/string&keytextureFileName/key&stringCCControlColourPickerSpriteSheet.png/string&/dict&/dict&/plist",
      "name": "1",
      "description": "",
      "method": "PUT",
      "body": {
        "mimeType": "application/xml",
        "text": "{\"file_format_version\": \"1.0.0\", \"ICD\": {\"library_path\": \".\\\\vk_swiftshader.dll\", \"api_version\": \"1.0.5\"}}\r\n}err up\r\n[0912/184848.319:WARNING:crash_reporting.cc(271)] Failed to set crash key: UserID with value: 0\r\n[0912/184848.319:WARNING:crash_reporting.cc(271)] Failed to set crash key: BuildID with value: 1757421143\r\n[0912/184848.319:WARNING:crash_reporting.cc(271)] Failed to set crash key: SteamUniverse with value: Public\r\n[0912/184848.319:WARNING:crash_reporting.cc(271)] Failed to set crash key: Vendor with value: Valve\r\n[0912/184848.319:WARNING:crash_reporting.cc(271)] Failed to set crash key: Platform with value: Win32\r\n[0912/184848.339:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0912/184849.324:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0912/185049.235:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0912/201847.809:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0913/112459.630:WARNING:crash_reporting.cc(271)] Failed to set crash key: UserID with value: 0\r\n[0913/112459.677:WARNING:crash_reporting.cc(271)] Failed to set crash key: BuildID with value: 1757421143\r\n[0913/112459.677:WARNING:crash_reporting.cc(271)] Failed to set crash key: SteamUniverse with value: Public\r\n[0913/112459.677:WARNING:crash_reporting.cc(271)] Failed to set crash key: Vendor with value: Valve\r\n[0913/112459.677:WARNING:crash_reporting.cc(271)] Failed to set crash key: Platform with value: Win32\r\n[0913/112459.943:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0913/112504.971:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0913/112703.964:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0913/113412.367:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/110946.613:WARNING:crash_reporting.cc(271)] Failed to set crash key: UserID with value: 0\r\n[0914/110946.613:WARNING:crash_reporting.cc(271)] Failed to set crash key: BuildID with value: 1757624188\r\n[0914/110946.613:WARNING:crash_reporting.cc(271)] Failed to set crash key: SteamUniverse with value: Public\r\n[0914/110946.613:WARNING:crash_reporting.cc(271)] Failed to set crash key: Vendor with value: Valve\r\n[0914/110946.613:WARNING:crash_reporting.cc(271)] Failed to set crash key: Platform with value: Win32\r\n[0914/110946.629:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/110949.894:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/111148.788:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/134555.996:WARNING:crash_reporting.cc(271)] Failed to set crash key: UserID with value: 0\r\n[0914/134556.049:WARNING:crash_reporting.cc(271)] Failed to set crash key: BuildID with value: 1757624188\r\n[0914/134556.049:WARNING:crash_reporting.cc(271)] Failed to set crash key: SteamUniverse with value: Public\r\n[0914/134556.049:WARNING:crash_reporting.cc(271)] Failed to set crash key: Vendor with value: Valve\r\n[0914/134556.049:WARNING:crash_reporting.cc(271)] Failed to set crash key: Platform with value: Win32\r\n[0914/134556.807:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/134604.598:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0914/134803.514:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages are omitted in official builds. Sorry!\r\n[0915/101304.387:WARNING:crash_reporting.cc(271)] Failed to set crash key: UserID with value: 0\r\n[0915/101304.403:WARNING:crash_reporting.cc(271)] Failed to set crash key: BuildID with value: 1757624188\r\n[0915/101304.404:WARNING:crash_reporting.cc(271)] Failed to set crash key: SteamUniverse with value: Public\r\n[0915/101304.404:WARNING:crash_reporting.cc(271)] Failed to set crash key: Vendor with value: Valve\r\n[0915/101304.404:WARNING:crash_reporting.cc(271)] Failed to set crash key: Platform with value: Win32\r\n[0915/101304.521:ERROR:check.cc(376)] Check failed: false. NOTREACHED log messages\r\n}body {\r\n    font-family: monospace;\r\n    font-size: 14px;\r\n    color: #a2a09b;\r\n\r\n    margin: 44px 36px 36px 36px;\r\n     background: #2c2c2c;\r\n\r\n    scrollbar-face-color: #4C5844;\r\n    scrollbar-shadow-color: #4C5844;\r\n    scrollbar-highlight-color: #4C5844;\r\n    scrollbar-3dlight-color: #818D7C;\r\n    scrollbar-darkshadow-color: #1C261E;\r\n    scrollbar-track-color: #5A6A50;\r\n    scrollbar-arrow-color: #969F8E;\r\n}\r\n"
      },
      "parameters": [
      ],
      "headers": [
        {
          "name": "Content-Type",
          "value": "application/xml"
        },
        {
          "name": "User-Agent",
          "value": "Mozilla/5.0"
        },
        {
          "name": "Accept",
          "value": "json"
        }
      ],
      "authentication": {
      },
      "responseBody": {
        "mimeType": "",
        "text": ""
      },
      "responseHeaders": [
      ],
      "responseStatus": {
        "code": 0,
        "time": 0.0,
        "size": 0
      },
      "metaSortKey": -1776375281698,
      "isPrivate": false,
      "settingStoreCookies": true,
      "settingSendCookies": true,
      "settingDisableRenderRequestBody": false,
      "settingEncodeUrl": true,
      "settingRebuildPath": true,
      "settingFollowRedirects": "global",
      "_type": "request"
    }
  ]
})
pause
exit
:check keystartColorVarianceAlpha
cls
echo dpi-desync-hostfakesplit-mod=host=www.google.com --new ^ 
(Fixed)
pause
exit
:check vps connections tls_clienthello_www_google_com
cls
echo The VPS tls_clienthello_www_google_com is working fine
pause
exit
:ALT3 a2a09b
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,hostfakesplit --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-hostfakesplit-mod=host=www.google.com,altorder=1 --dpi-desync-fooling=ts --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,hostfakesplit --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-hostfakesplit-mod=host=www.google.com,altorder=1 --dpi-desync-fooling=ts --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,hostfakesplit --dpi-desync-fake-tls-mod=rnd,dupsid,sni=ya.ru --dpi-desync-hostfakesplit-mod=host=ya.ru,altorder=1 --dpi-desync-fooling=ts --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,hostfakesplit --dpi-desync-fake-tls-mod=rnd,dupsid,sni=ya.ru --dpi-desync-hostfakesplit-mod=host=ya.ru,altorder=1 --dpi-desync-fooling=ts --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,hostfakesplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=ya.ru --dpi-desync-hostfakesplit-mod=host=ya.ru,altorder=1 --dpi-desync-fooling=ts --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n4
pause
exit
:ALT3 real240
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_list
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=1000 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=1000 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=1000 --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=1000 --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-repeats=6 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=1000 --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 HKLM
cls
echo chcp 65001 > nul
:: 65001 - UTF-8
:: NOT RECOMMENDED

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-l3=ipv4 --filter-tcp=80,443,2053,2083,2087,2096,8443 --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=syndata,multidisorder --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=syndata,multidisorder --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=14 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n3
pause
exit
:ALT3 a2a190b
cls
echochcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 yoffset
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=multisplit --dpi-desync-split-pos=2,sniext+1 --dpi-desync-split-seqovl=679 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=multisplit --dpi-desync-split-pos=2,sniext+1 --dpi-desync-split-seqovl=679 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=multisplit --dpi-desync-split-pos=2,sniext+1 --dpi-desync-split-seqovl=679 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=syndata --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=syndata --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 HKCU
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake --dpi-desync-fake-tls-mod=none --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake --dpi-desync-fake-tls-mod=none --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-fake-tls-mod=none --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-fake-tls-mod=none --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fake-tls-mod=none --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 keyangle
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=hostfakesplit --dpi-desync-repeats=4 --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=hostfakesplit --dpi-desync-repeats=4 --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=hostfakesplit --dpi-desync-repeats=4 --dpi-desync-fooling=ts,md5sig --dpi-desync-hostfakesplit-mod=host=ozon.ru --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=hostfakesplit --dpi-desync-repeats=4 --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=ozon.ru --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=hostfakesplit --dpi-desync-repeats=4 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=ozon.ru --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 n0
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=none --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_4pda_to.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_4pda_to.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fooling=ts --dpi-desync-fake-tls="%BIN%stun.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_4pda_to.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_4pda_to.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=12 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT3 n2
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun2.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n4
pause
exit
:bypassing the block .com 1
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:bypassing the block .com 2
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:server reboot
cls
echo service reboot is ALT3 a2a09b,ALT3 real240,ALT3 yoffset,ALT3 HKCU,ALT3 keyangle,ALT3 n0,ALT3 n2 
CODE :%~n0"BIN=%~dp0bin\%~dp0lists updated ("--filter-udp=443 --hostlist=")
CODE :%~n0 "--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
CODE :%~n0 "filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^"
pause
exit
:ALT3 n3
cls
echochcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun2.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n4
pause
exit
:ALT3 EXP
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-l7=quic --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun,unknown --dpi-desync=fake --dpi-desync-any-protocol=1 --dpi-desync-fake-discord="%BIN%quic_initial_www_google_com.bin" --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-unknown-udp="%BIN%quic_initial_www_google_com.bin" --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=4 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=hostfakesplit --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=480 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=4 --dpi-desync-split-seqovl-pattern="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --hostlist-exclude-domains=fonts.googleapis.com --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=480 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=4 --dpi-desync-split-seqovl-pattern="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=5 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%quic_initial_4pda.to.bin" --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n4
pause
exit
:VPN URL requirement
cls
echo Windows 11 is required.A security module (version 1.2 2.0) is required.A LAN cable is required for a direct internet connection to the computer.
pause
exit
:ALT4 EXP 1
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-l7=quic --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun,unknown --dpi-desync=fake --dpi-desync-any-protocol=1 --dpi-desync-fake-discord="%BIN%quic_initial_www_google_com.bin" --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-unknown-udp="%BIN%quic_initial_www_google_com.bin" --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=4 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=hostfakesplit --dpi-desync-fooling=ts --dpi-desync-hostfakesplit-mod=host=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=480 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=4 --dpi-desync-split-seqovl-pattern="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --hostlist-exclude-domains=fonts.googleapis.com --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=480 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=4 --dpi-desync-split-seqovl-pattern="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=664 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=5 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%quic_initial_4pda.to.bin" --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n4
pause
exit
:ALT4 EXP 2
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,fakedsplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-repeats=8 --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT4 EXP 3
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=10000000 --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT4 EXP 4
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n3
pause
exit
:ALT4 EXP 5
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

start "zapret: %~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multisplit --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-seqovl=681 --dpi-desync-split-pos=1 --dpi-desync-fooling=ts --dpi-desync-repeats=8 --dpi-desync-split-seqovl-pattern="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n3
pause
exit
:ALT4 EXP 6
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown=0x00000000 --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT4 EXP 7
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun2.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT4 EXP 8
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=11 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake,multidisorder --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n4 --dpi-desync-split-pos=1,midsld --dpi-desync-repeats=11 --dpi-desync-fooling=badseq --dpi-desync-fake-tls=0x00000000 --dpi-desync-fake-tls=^! --dpi-desync-fake-tls-mod=rnd,dupsid,sni=www.google.com --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown=0x00000000 --dpi-desync-fake-unknown="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:ALT4 EXP 9
cls
echo chcp 65001 > nul
:: 65001 - UTF-8

cd /d "%~dp0"
call service.bat status_zapret
call service.bat check_updates
call service.bat load_game_filter
call service.bat load_user_lists
set "BIN=%~dp0bin\"
set "LISTS=%~dp0lists\"
cd /d %BIN%

%~n0" /min "%BIN%winws.exe" --wf-tcp=80,443,2053,2083,2087,2096,8443,%GameFilterTCP% --wf-udp=443,19294-19344,50000-50100,%GameFilterUDP% ^
--filter-udp=443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-udp=19294-19344,50000-50100 --filter-l7=discord,stun --dpi-desync=fake --dpi-desync-fake-discord="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-fake-stun="%BIN%ACTIVE_DISCORD_UDP.bin" --dpi-desync-repeats=6 --new ^
--filter-tcp=2053,2083,2087,2096,8443 --hostlist-domains=discord.media --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=443 --hostlist="%LISTS%list-google.txt" --ip-id=zero --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-tcp=80,443 --hostlist="%LISTS%list-general.txt" --hostlist="%LISTS%list-general-user.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-udp=443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fake-quic="%BIN%quic_initial_www_google_com.bin" --new ^
--filter-tcp=80,443,8443 --ipset="%LISTS%ipset-all.txt" --hostlist-exclude="%LISTS%list-exclude.txt" --hostlist-exclude="%LISTS%list-exclude-user.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --new ^
--filter-tcp=%GameFilterTCP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=6 --dpi-desync-any-protocol=1 --dpi-desync-cutoff=n3 --dpi-desync-fooling=badseq --dpi-desync-badseq-increment=2 --dpi-desync-fake-tls="%BIN%stun2.bin" --dpi-desync-fake-tls="%BIN%tls_clienthello_www_google_com.bin" --dpi-desync-fake-http="%BIN%tls_clienthello_max_ru.bin" --dpi-desync-fake-unknown="%BIN%stun2.bin" --dpi-desync-fake-unknown="%BIN%tls_clienthello_www_google_com.bin" --new ^
--filter-udp=%GameFilterUDP% --ipset="%LISTS%ipset-all.txt" --ipset-exclude="%LISTS%ipset-exclude.txt" --ipset-exclude="%LISTS%ipset-exclude-user.txt" --dpi-desync=fake --dpi-desync-repeats=10 --dpi-desync-any-protocol=1 --dpi-desync-fake-unknown-udp="%BIN%ACTIVE_GAME_UDP.bin" --dpi-desync-cutoff=n2
pause
exit
:exit
cls
echo Prees ENTER to exit
pause
exit