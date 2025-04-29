📝 Compte rendu du projet : Spring Boot MVC avec Thymeleaf
🎯 Objectif du projet
Ce projet a été réalisé dans le cadre d’un TP visant à comprendre le fonctionnement du framework Spring Boot en appliquant le pattern MVC (Model-View-Controller).
Il met en œuvre une application web permettant d’inscrire et d’afficher une liste d’étudiants à l’aide du moteur de template Thymeleaf.

🛠️ Technologies utilisées
☕ Java (version 17)

🚀 Spring Boot

🌐 Spring Web (Spring MVC)

🎨 Thymeleaf

🧰 Maven

✔️ Jakarta Validation

🖥️ IDE : IntelliJ IDEA (ou autre)

📖 Description du projet
L’application permet de :

🏠 Afficher une page d’accueil simple

📝 Gérer l’inscription d’étudiants via un formulaire HTML

📋 Afficher dynamiquement une liste des étudiants inscrits

✅ Valider les champs du formulaire avec des annotations (@NotBlank, @Size, etc.)

🧩 Utiliser le moteur Thymeleaf pour intégrer les données dans les vues HTML

⚙️ Fonctionnement général
🎯 Le contrôleur principal gère les routes et transmet les données à la vue

📦 Les modèles (Student) stockent et valident les données

🖼️ Les vues Thymeleaf affichent les formulaires, les erreurs et les listes dynamiques

🌐 Routes disponibles

Route	Description
/	Page d’accueil
/students/register	Formulaire d’inscription
/students/list	Liste des étudiants
✅ Résultat obtenu
Le projet fonctionne correctement. L’utilisateur peut :

🔍 Accéder à la page d’accueil

➕ Ajouter un nouvel étudiant avec vérification des champs

👁️ Voir la liste des étudiants déjà ajoutés

🧠 Conclusion
Ce TP m’a permis de mieux comprendre :

🧱 L’architecture Spring MVC

📝 La gestion des formulaires avec Spring

🌐 L’utilisation de Thymeleaf pour créer des vues dynamiques

🔐 La validation backend avec Jakarta Validation
