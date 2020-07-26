# Android-Chatbot

A chatbot is a piece of software that conducts a conversation via auditory or textual methods. Our chatbot application will be able to conduct simple conversation with the user. We are using Dialogflow to create an AI agent which can respond to the user in the application.

Dialogflow is a Google-owned developer of human – computer interaction technologies based on natural language conversations. We can create AI agents to which can respond to user for the queries of user. Using Dialogflow we can add some contexts to make the agent reply with the information provided by developers. We can also have some extra Intents in Dialogflow to do the same.

By using the Dialogflow API we can access the Dialogflow agent through our android application and get the responses. This application also has speech to text support in the chatbot. Using this speech to text conversion user can have conversations with the chatbot using speech.

### We have following activities in our application
 ****

  - Registration Activity
  - Login Activity
  - Chatting Acitivty (Main Activity)
  - Feedback Activity
  - About Activity


## #Execution
****

- We need to create a dialogflow agent and then connect it to our chatbot application by using the key. Replace key in MainActivity.java with your agent key to interact with your own agent.
- The Login and Registration process is by connecting to firebase.
- The feedback is stored in firebase realtime database.

###Application userinterface
****
<table>
  <tr>
    <td>Welcome Screen</td>
     <td>Registration Page</td>
     <td>Login Page</td>
  </tr>
  <tr>
    <td><img src="img/welcome.png" width=270 height=480></td>
    <td><img src="img/registration.png" width=270 height=480></td>
    <td><img src="img/Login.png" width=270 height=480></td>
  </tr>
  <tr>
        <td>Chatbot layout</td>
     <td>feedback Page</td>
     <td> Options menu</td>
  </tr>
  <tr>
    <td><img src="img/Chatbot.png" width=270 height=480></td>
    <td><img src="img/feedback.png" width=270 height=480></td>
    <td><img src="img/menu.png" width=270 height=480></td>
  </tr>
 </table>

Thank you...
