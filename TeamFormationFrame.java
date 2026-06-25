<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
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
              <EmptySpace min="-2" pref="28" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" max="-2" attributes="0">
                  <Component id="txtLearningProgress" alignment="0" min="-2" pref="132" max="-2" attributes="0"/>
                  <Component id="txtCompletionPercentage" alignment="0" max="32767" attributes="0"/>
                  <Component id="txtSelectedCriteria" alignment="0" max="32767" attributes="0"/>
                  <Group type="102" alignment="0" attributes="0">
                      <Group type="103" groupAlignment="1" max="-2" attributes="0">
                          <Component id="txtProgressWeight" max="32767" attributes="0"/>
                          <Component id="txtCompletionWeight" pref="184" max="32767" attributes="0"/>
                      </Group>
                      <EmptySpace min="32" pref="32" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="txfCompletionWeight" alignment="0" max="32767" attributes="0"/>
                          <Component id="txfProgressWeight" alignment="1" min="-2" pref="142" max="-2" attributes="0"/>
                      </Group>
                  </Group>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="btnCalculateTOPSIS" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="32767" attributes="0"/>
          </Group>
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="line1" alignment="0" max="32767" attributes="0"/>
                  <Component id="line2" alignment="1" max="32767" attributes="0"/>
                  <Group type="102" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jScrollPane1" max="32767" attributes="0"/>
                          <Group type="102" attributes="0">
                              <Component id="jRankingREsult" min="-2" pref="254" max="-2" attributes="0"/>
                              <EmptySpace max="32767" attributes="0"/>
                              <Component id="btnBack" min="-2" max="-2" attributes="0"/>
                          </Group>
                      </Group>
                  </Group>
              </Group>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <EmptySpace min="-2" pref="23" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="txtProgressWeight" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="txfProgressWeight" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="txtCompletionWeight" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="txfCompletionWeight" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="btnCalculateTOPSIS" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace min="-2" pref="23" max="-2" attributes="0"/>
              <Component id="line1" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="txtSelectedCriteria" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="txtLearningProgress" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Component id="txtCompletionPercentage" min="-2" max="-2" attributes="0"/>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="line2" min="-2" max="-2" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Component id="btnBack" min="-2" max="-2" attributes="0"/>
                  <Component id="jRankingREsult" min="-2" max="-2" attributes="0"/>
              </Group>
              <EmptySpace type="separate" max="-2" attributes="0"/>
              <Component id="jScrollPane1" pref="194" max="32767" attributes="0"/>
              <EmptySpace max="-2" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="txtProgressWeight">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Progress Weight (%)         :"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="btnCalculateTOPSIS">
      <Properties>
        <Property name="text" type="java.lang.String" value="Calculate"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnCalculateTOPSISActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTable" name="tblReport">
          <Properties>
            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
              <Table columnCount="5" rowCount="20">
                <Column editable="true" title="Rank" type="java.lang.Integer"/>
                <Column editable="true" title="User ID" type="java.lang.Integer"/>
                <Column editable="true" title="Learning Progress" type="java.lang.Double"/>
                <Column editable="true" title="Completion Status" type="java.lang.Double"/>
                <Column editable="true" title="Score" type="java.lang.Double"/>
              </Table>
            </Property>
            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
              <TableColumnModel selectionModel="0">
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
              </TableColumnModel>
            </Property>
            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
            </Property>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jRankingREsult">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI Black" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Ranking Result"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="txtCompletionWeight">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Completion Weight (%)     :"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="txtSelectedCriteria">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI Black" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Selected Criteria"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="txtLearningProgress">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="1. Learning Progress"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="txtCompletionPercentage">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Segoe UI" size="14" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="2. Completion Percentage"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="line1">
      <Properties>
        <Property name="text" type="java.lang.String" value="------------------------------------------------------------------------------------------------------------------"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="line2">
      <Properties>
        <Property name="text" type="java.lang.String" value="-------------------------------------------------------------------------------------------------------------------"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="txfProgressWeight">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="txfProgressWeightActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JTextField" name="txfCompletionWeight">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="txfCompletionWeightActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="btnBack">
      <Properties>
        <Property name="text" type="java.lang.String" value="Back"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnBackActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>
