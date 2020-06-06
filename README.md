# ejecicio3examen


<H3>Resolucion de fallo en el examen, dependencyCheckPublisher, archivo XML no estaba siendo generado<\3><\br>
  
<plugin>
				<groupId>org.owasp</groupId>
				<artifactId>dependency-check-maven</artifactId>
				<version>5.3.2</version>
				<configuration>
					<skipTestScope>false</skipTestScope>
					<formats>HTML</formats>
					<formats>XML</formats>
				</configuration>
          <reportSets>
            <reportSet>
              <reports>
                <report>aggregate</report>
              </reports>
            </reportSet>
				</reportSets>
</plugin>
