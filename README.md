# OOPLand Adventure

This is a text-based adveture game set in the fantastical realm of OOPLand. It provides an example of Object-Oriented
Programming (OOP) and how SOLID design principles can be implemented in Java.

### Getting Started

To get started with this project, clone it onto your local machine and open it in your favourite Java IDE.

```git
git clone https://github.com/icodelazy/OOPLandAdventure.git
```

### Game Architecture

The architecture of the game revolves around the concepts of OOP and specifically implements SOLID design principles.

- OOPLander.java: This is a base class that creates an OOPLander character. It has features such as name, rank, and
  abilities which can be set and retrieved as per the game requirements.
  <br></br>
- Mage.java: This is a specific character type that extends the OOPLander class. It has its own attributes and
  behaviours. Mages can perform various actions like casting a spell, fighting, and defending themselves. They have a
  mana restriction and can rest and replenish their mana if it runs out.
  <br></br>
- Skill.java: This is an interface that lays out the behaviors of characters that can perform skillful actions.
  <br></br>
- Replenish.java: This is an interface for characters who have the ability to restore or replenish something that's
  spent, like energy or mana.
  <br></br>

### Usage

After you've started the game, you can create your character and choose to be an OOPLander or a Mage. Each character has
different abilities and varying range of responses based on their power and the type of action they are performing.
Enjoy the adventure in OOPLand!

### Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.