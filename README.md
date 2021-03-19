# smart-garage

M214 - Conception Orientée Objet // Étude du Fil-Rouge : Garage Intelligent

![UseCase](https://i.imgur.com/PCdTcXB.png)

Fiche suiveuse : Fiche contenant les informations (Immatriculation, Modèle, Marque, Travaux antérieurs) d’un véhicule. <br/>
Puce : Puce électromagnétique placée dans une voiture contenant toutes les informations relatives à celle-ci. <br/>
Badge : Puce électromagnétique servant à identifier les mécaniciens.<br/>

![InterfaceGraphique](https://i.imgur.com/fV40Vx0.png)

Pour compléter la fiche suiveuse, le mécanicien doit remplir la fiche suiveuse en utilisant son badge (afin de s’identifier en tant que mécanicien) puis à l’aide de la puce correspondant à la voiture à laquelle est associée la ou les réparations. Pour cela, il doit se servir d’un boîtier (séquence de validation par le système). Une fois identifié, avec la voiture, ce dernier peut ajouter ou modifier des informations relatives aux réparations à travers la fiche suiveuse. Une fois les réparations terminées, il peut décider de laisser un message (pré-enregistré ou personnalisé). <br/><br/>
Flot basique :
1) Le client prend un rendez-vous et paye <br/>
2) La secrétaire enregistre ce rendez-vous et établie une fiche suiveuse à laquelle sera affectée une puce (pour la voiture) <br/>
3) Le mécanicien consulte la fiche suiveuse à l'aide de son badge et de la puce. Le mécanicien complète la fiche suiveuse <br/><br/>
Flot alternatif : <br/>
1) Le mécanicien choisit de laisser un message (personnalisé ou prédéfini) <br/>
2) Le mécanicien décide de consulter les travaux antérieurs <br/>
3) Le client décide de consulter l'avancement des réparations entreprises sur son véhicule <br/><br/>
Flot d'erreur : <br/>
1) La secrétaire n'établit pas de fiche suiveuse <br/>
2) La secrétaire n'affecte pas de puce électronique à la voiture <br/>
3) Le système de paiement externe ne fonctionne pas <br/>
4) L'identification d'un des acteurs échoue <br/>
5) Le mécanicien oublie de compléter la fiche suiveuse ou omet une information <br/>

![DiagUMLClass](https://i.imgur.com/zFIgzn2.png)

![SequenceDiag](https://i.imgur.com/DDXCip5.png)
