<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <NonVisualComponents>
    <Component class="javax.swing.JButton" name="jButton1">
      <Properties>
        <Property name="text" type="java.lang.String" value="jButton1"/>
      </Properties>
    </Component>
  </NonVisualComponents>
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
                      <EmptySpace min="-2" pref="123" max="-2" attributes="0"/>
                      <Component id="btnGenerate" min="-2" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="48" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="chkDatabase" alignment="0" min="-2" pref="115" max="-2" attributes="0"/>
                          <Component id="chkJava" alignment="0" min="-2" pref="115" max="-2" attributes="0"/>
                          <Component id="chkNetworking" alignment="0" min="-2" pref="115" max="-2" attributes="0"/>
                          <Component id="chkPython" alignment="0" min="-2" pref="115" max="-2" attributes="0"/>
                      </Group>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="150" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="1" attributes="0">
                          <Component id="jScrollPane1" min="-2" pref="318" max="-2" attributes="0"/>
                          <Component id="jLabel1" min="-2" pref="231" max="-2" attributes="0"/>
                          <Group type="102" alignment="1" attributes="0">
                              <Group type="103" groupAlignment="1" attributes="0">
                                  <Component id="btnSelect" min="-2" pref="182" max="-2" attributes="0"/>
                                  <Component id="btnback" min="-2" pref="182" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="-2" pref="82" max="-2" attributes="0"/>
                          </Group>
                      </Group>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="225" max="-2" attributes="0"/>
                      <Component id="cmbTeammate" min="-2" pref="141" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace pref="136" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace max="-2" attributes="0"/>
              <Component id="jLabel1" min="-2" pref="44" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Component id="btnGenerate" min="-2" pref="44" max="-2" attributes="0"/>
                  <Group type="102" attributes="0">
                      <Component id="chkJava" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                      <Component id="chkDatabase" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                      <Component id="chkNetworking" min="-2" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="chkPython" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="jScrollPane1" min="-2" pref="217" max="-2" attributes="0"/>
              <EmptySpace type="unrelated" max="-2" attributes="0"/>
              <Component id="cmbTeammate" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="btnSelect" min="-2" pref="40" max="-2" attributes="0"/>
              <EmptySpace pref="44" max="32767" attributes="0"/>
              <Component id="btnback" min="-2" pref="37" max="-2" attributes="0"/>
              <EmptySpace min="-2" pref="20" max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="20" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="TEAM FORMATION"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="btnGenerate">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Generate Team"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnGenerateActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTextArea" name="txtResult">
          <Properties>
            <Property name="columns" type="int" value="20"/>
            <Property name="rows" type="int" value="5"/>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JButton" name="btnback">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Arial" size="14" style="1"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Back To Dashboard"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnbackActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JCheckBox" name="chkJava">
      <Properties>
        <Property name="text" type="java.lang.String" value="Java"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="chkJavaActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JCheckBox" name="chkPython">
      <Properties>
        <Property name="text" type="java.lang.String" value="Python&#xa;"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="chkPythonActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JCheckBox" name="chkNetworking">
      <Properties>
        <Property name="text" type="java.lang.String" value="Networking"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="chkNetworkingActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JCheckBox" name="chkDatabase">
      <Properties>
        <Property name="text" type="java.lang.String" value="Database"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="chkDatabaseActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JComboBox" name="cmbTeammate">
      <Properties>
        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
          <StringArray count="0"/>
        </Property>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="cmbTeammateActionPerformed"/>
      </Events>
      <AuxValues>
        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
      </AuxValues>
    </Component>
    <Component class="javax.swing.JButton" name="btnSelect">
      <Properties>
        <Property name="text" type="java.lang.String" value="Select Teammate"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnSelectActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
