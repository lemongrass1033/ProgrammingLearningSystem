<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="3"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <EmptySpace max="32767" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="btnLogout" min="-2" pref="255" max="-2" attributes="0"/>
                  <Component id="btnViewProgress" min="-2" pref="255" max="-2" attributes="0"/>
                  <Group type="103" groupAlignment="1" max="-2" attributes="0">
                      <Component id="btnUpdateProfile" max="32767" attributes="0"/>
                      <Component id="btnTeamFormation" pref="255" max="32767" attributes="0"/>
                      <Component id="btnViewProfile" max="32767" attributes="0"/>
                      <Component id="btnViewCompletion" alignment="0" max="32767" attributes="0"/>
                      <Component id="btnCourseRegistration" alignment="0" max="32767" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace max="32767" attributes="0"/>
          </Group>
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="136" max="-2" attributes="0"/>
              <Component id="lblWelcome" min="-2" pref="296" max="-2" attributes="0"/>
              <EmptySpace max="32767" attributes="0"/>
          </Group>
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="89" max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" pref="374" max="-2" attributes="0"/>
              <EmptySpace pref="122" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="19" max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" pref="23" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="28" max="-2" attributes="0"/>
              <Component id="lblWelcome" min="-2" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="31" max="-2" attributes="0"/>
              <Component id="btnUpdateProfile" min="-2" pref="48" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="btnViewProfile" min="-2" pref="41" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="btnTeamFormation" min="-2" pref="44" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="btnCourseRegistration" min="-2" pref="48" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnViewProgress" min="-2" pref="48" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnViewCompletion" min="-2" pref="48" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnLogout" min="-2" pref="42" max="-2" attributes="0"/>
              <EmptySpace pref="27" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JButton" name="btnViewProfile">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="View Profile"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnViewProfileActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnTeamFormation">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Team Formation"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnTeamFormationActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnUpdateProfile">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Update Profile"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnUpdateProfileActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnLogout">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Logout"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnLogoutActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="20" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="PROGRAMMING LEARNING SYSTEM"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="lblWelcome">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="18" style="0"/>
        </Property>
        <Property name="horizontalAlignment" type="int" value="0"/>
        <Property name="text" type="java.lang.String" value="Welcome"/>
        <Property name="horizontalTextPosition" type="int" value="0"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="btnViewProgress">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="View Progress"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnViewProgressActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnViewCompletion">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="View Completion Status"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnViewCompletionActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnCourseRegistration">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Course Registration"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnCourseRegistrationActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
