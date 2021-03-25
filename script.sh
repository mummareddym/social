#!/bin/bash
pwd
git clone git@github.com:mummareddym/social.git
cd social
mvn clean verify sonar:sonar -Dsonar.projectKey=mummareddym_social -Dsonar.host.url=https://sonarqube.pp.hotstar-labs.com -Dsonar.login=dbf02ebb7e9607cd12ede90f5492f63adcdc0f75
