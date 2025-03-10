# 🏥 Application de Gestion des Consultations et Patients

## 📌 Description
Cette application permet de gérer les patients et leurs consultations médicales en utilisant **JavaFX** pour l'interface utilisateur et une architecture en couches pour une meilleure organisation du code.

---

## 📂 Structure du Projet

### 📁 `config/`
- **`DatabaseConfig`** : Configuration de la base de données.

### 📁 `controllers/`
- **`ConsultationController`** : Gère les événements liés aux consultations.
- **`PatientController`** : Gère les interactions liées aux patients.

### 📁 `dao/`
- **Sous-dossier `consultation/`**
  - `ConsultationDao` : Implémentation de l'accès aux données des consultations.
  - `IConsultationDao` : Interface définissant les méthodes pour la gestion des consultations.
- **Sous-dossier `patient/`**
  - `PatientDao` : Implémentation de l'accès aux données des patients.
  - `IPatientDao` : Interface définissant les méthodes pour la gestion des patients.
- **`Dao`** : Classe générique pour la gestion des accès aux données.

### 📁 `models/`
- **`Consultation`** : Modèle représentant une consultation.
- **`Patient`** : Modèle représentant un patient.

### 📁 `services/`
- **Sous-dossier `consultation/`**
  - `ConsultationService` : Service de gestion des consultations.
  - `IConsultationService` : Interface définissant les méthodes des services pour les consultations.
- **Sous-dossier `patient/`**
  - `PatientService` : Service de gestion des patients.
  - `IPatientService` : Interface définissant les méthodes des services pour les patients.

### 📁 `resources/`
- **FXML pour l'interface utilisateur :**
  - `main-view.fxml` : Vue principale avec navigation entre les sections.
  - `patients-view.fxml` : Formulaire et liste des patients.
  - `consultation-view.fxml` : Formulaire et liste des consultations.

### 📄 `Main.java`
- Point d'entrée de l'application, initialise l'interface et les services.

### 📄 `module-info.java`
- Fichier de configuration du module Java.

---

## 📸 Captures d'écran
Voici quelques aperçus de l'application :

### ➕👤🏥 Écran d'ajout un patient
![Écran d'accueil](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Ajouter_Patient.gif?raw=true)

### ✏️👤🏥 Écran de modifier un patient
![Écran d'accueil](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Modifier_Patient.gif?raw=true)

### 🗑️👤🏥 Écran de supprimer un patient
![Écran d'accueil](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Supprimer_Patient.gif?raw=true)

### 🔍👤🏥 Écran de Recherche un patient
![Écran d'accueil](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Rechercher_Patient.gif?raw=true)

### ⚠️👤🏥 Écran de gestion des exceptions d'un patient
![Écran d'accueil](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Gestion_Exception_Patient.gif?raw=true)

### ➕🩺 Ajouter une consultation
![Liste des patients](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Ajouter_Consultation.gif?raw=true)

### ✏️🩺 Modifier une consultation
![Détail consultation](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Modifier_Consultation.gif?raw=true)

### 🗑️🩺 Supprimer une consultation
![Détail consultation](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Supprimer_Consultation.gif?raw=true)

### 🔍🩺 Rechercher une consultation
![Détail consultation](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Rechercher_Consultation.gif?raw=true)

### ⚠️🩺 Écran de gestion des exceptions d'une consultation
![Détail consultation](https://github.com/ssifdine/AppG_Consult_Patients/blob/master/capture/Gestion_Exceprion_Consultation.gif?raw=true)

## 🎨 Technologies utilisées
- **Java 23**
- **JavaFX** (Interface graphique)
- **MySQL** (Base de données)
- **BootstrapFX** (Design UI)
- **DAO Pattern** (Architecture d'accès aux données)
- **MVC** (Architecture Modèle-Vue-Contrôleur)

---

## 🚀 Installation et Exécution
1. **Cloner le projet**  
   ```sh
   git clone https://github.com/ssifdine/appg_consult_patients.git
