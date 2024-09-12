pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9' // Assurez-vous que Maven est installé dans Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Cloner le code depuis le dépôt Git
                git 'https://github.com/elmardi-repos/MyProjectJava1.git'
            }
        }

        stage('Build') {
            steps {
                // Construire le projet avec Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Lancer les tests unitaires avec Maven
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Créer un fichier JAR à partir du projet
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                // Déployer l'application (par exemple, copier sur un serveur)
                echo 'Déploiement en cours...'
                // Exemple: sh 'scp target/*.jar user@server:/path/to/deploy'
            }
        }
    }

    post {
        success {
            // Actions à effectuer après un succès
            echo 'Le build a réussi !'
        }
        failure {
            // Actions à effectuer après un échec
            echo 'Le build a échoué.'
        }
    }
}
