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
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="98" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="btnManageStudents" alignment="0" min="-2" pref="256" max="-2" attributes="0"/>
                          <Group type="103" groupAlignment="1" max="-2" attributes="0">
                              <Component id="btnManageProgress" alignment="0" pref="256" max="32767" attributes="0"/>
                              <Component id="Logout" alignment="0" max="32767" attributes="0"/>
                          </Group>
                          <Component id="btnManageCourse" alignment="0" min="-2" pref="256" max="-2" attributes="0"/>
                          <Component id="btnUpdateProfile" alignment="0" min="-2" pref="256" max="-2" attributes="0"/>
                          <Component id="btnViewProfile" alignment="0" min="-2" pref="256" max="-2" attributes="0"/>
                          <Component id="lblTitle" alignment="0" min="-2" pref="283" max="-2" attributes="0"/>
                          <Component id="btnManageCompletionStatus" alignment="0" min="-2" pref="256" max="-2" attributes="0"/>
                      </Group>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="175" max="-2" attributes="0"/>
                      <Component id="lblWelcome" min="-2" pref="159" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace pref="139" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <Component id="lblTitle" min="-2" pref="44" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="12" max="-2" attributes="0"/>
              <Component id="lblWelcome" min="-2" pref="32" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="btnViewProfile" min="-2" pref="43" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnUpdateProfile" min="-2" pref="41" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnManageCourse" min="-2" pref="41" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnManageStudents" min="-2" pref="38" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnManageProgress" min="-2" pref="42" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="btnManageCompletionStatus" min="-2" pref="44" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="Logout" min="-2" pref="41" max="-2" attributes="0"/>
              <EmptySpace pref="138" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="lblTitle">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="20" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="INSTRUCTOR DASHBOARD"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="lblWelcome">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Welcome Instructor"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="btnUpdateProfile">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Update Profile"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnUpdateProfileActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnManageCourse">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Manage Courses"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnManageCourseActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnViewProfile">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="View Profile"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnViewProfileActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="Logout">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Logout"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="LogoutActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnManageStudents">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Manage Students"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnManageStudentsActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnManageProgress">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Manage Progress"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnManageProgressActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnManageCompletionStatus">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Manage Completion Status"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnManageCompletionStatusActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
