# qa-final-project-java

qa-final-project-java

[![CI Pipeline for QA Project](https://github.com/RaduAurelTeodorescu/qa-final-project-java/actions/workflows/ci.yaml/badge.svg)](https://github.com/RaduAurelTeodorescu/qa-final-project-java/actions/workflows/ci.yaml)

Proiectul are ca scop executarea testului API ApiTests.txt pentru https://jsonplaceholder.typicode.com intr-un container Docker.



Executarea testului api se face folosindu-se datele din app.yaml (unde avem site-ul testat si alti parametri) si containerizarea cu fisierul Dockerfile (unde avem toate dependintele pentru imaginea testului si containerul pentru el).



Odata ce fisierele sunt facute, se creaza imaginea in Docker prin comanda docker build -t <nume proiect> . si se ruleaza testul prin crearea containerului si executarea testului in el prin comanda docker build --rm <nume proiect>.

