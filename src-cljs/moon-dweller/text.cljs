(ns moon-dweller.text)

; All game text, namespaced to allow for easy management (adding new rooms, etc).

(def game-text
  '{rooms
    [
      ("You are in a small, silver-walled room with no windows. There is a door to the north labelled 'Repairs deck' and another door to the east."
       "Small, featureless room. Doors to north and east.")
      ("You are in another small, featureless room. There is nothing of interest here except doors to the north and west."
       "Small, featureless room. Doors to north and west.")
      ("You enter a control room with a few blank screens. There are doors to the east and west."
       "Control room with doors to east and west")
      ("There is a long row of broken flying machines here. A large sign reads 'Repairs deck: West end'. 'Where the fuck am I?' you think to yourself. The passage leads east. There is a door to the south."
       "West-end of the repairs deck. Passage leads east. Door to the south.")
      ("You walk into a hallway with doors to your west and south. The door to the west has a sign reading 'Repairs deck'. The hallway is leading north."
       "Hallway. Doors to the west and south. Passage leads north.")
      ("You continue along the passage and pass more broken machines. Passage leads east or west."
       "Repairs deck, center. Passage leads west/east.")
      ("You are at the end of the hallway. There is a large, sliding door in front of you."
       "End of hallway. Large door here.")
      ("There are a bunch of broken machines lying around on the repairs deck. There is a door to the east or a passage west."
       "Repairs deck. Door to the east and passage south.")
      ("You are in a large room with space age decor. It seems to be the central living quarters. The walls are lined with pictures of the late comedian, Bill Hicks. There are walkways to the west and northwest and a door to the south."
       "Central living quarters, walkways to west and northwest, door to south.")
      ("You can see some more framed pictures of Bill Hicks here. As you walk past them, Bills eyes seem to follow you. The passage goes west or east."
       "Passage with more creepy Bill Hicks pictures. Passage leads east/west.")
      ("You are at the west-end of the room. Here you can see sealed entrance and a sign saying 'Exit pod'. Passage goes north-east or east."
       "West-end of large room with exit pod. Passages north-east and east.")
      ("You are at the front of the large room. There is a huge glass-like window here and you can see now that you are, infact, travelling through space! There are passages going back southeast and southwest."
       "Front of large room with huge glass-like window. Passages southeast/southwest.")
      ("You are in a dark alley and there is rubbish lying around everywhere. There are solid walls behind you and to either side. The alley leads south."
       "Dead-end of alley. Passage leads south.")
      ("You are standing at the entrance of an obscure-looking shop. There are cryptic characters on the sign. You can go in or head back to the west."
       "Entrance to obscure shop. Dead-end.")
      ("You are faced with two paths - one to the east and one going south. Both are slimy and wet."
       "Alley way. Paths to south/north and also to the east")
      ("The shop has no attendant. You can see a bunch of empty viles, odd trinkets and another Bill Hicks portrait."
       "Unattended shop with crap lying around.")
      ("You are standing at the entrance of a grimy looking liquor store."
       "Grimy liquor store entrance. Passage goes west.")
      ("The shop is in disarray and is pretty much empty, although there are some things lying around."
       "Bottle shop with attendant.")
      ("You are at another corner. There are paths running both east and west, or back to the north."
       "Bottom of alley, passages to east/west or back north.")
      ("You are at the end of the alley way and you can see a street to your west."
       "End of alley, street to the west.")
      ("You are on a road. It doesn't seem to be used anymore, though. It runs both north and south."
       "Road with no vehicles, running north/south. Alley to the east.")
      ("You are at the entrance of a Library of Ancient Technology. You can go in or head back south."
       "Library of Ancient Technology. Go in or back south.")
      ("You are now into the actual library area (It's labelled Isle zero). There are rows of books to your east and west and further shelving to the north."
       "Isle zero. Shelves to east and west. Isle one to the north, exit to the south.")
      ("You are inside the library's foyer. You can see several rows of shelves to your north. This place does not look very popular. The exit is behind you."
       "Entrance of the library. Rows of shelves to the north or you can go out.")
      ("You are in Isle Zero-B, the Embedded Programming section. There are assorted books with titles like 'We are demigods', 'Mastery of C with UNT' and 'Embed this: A beginners quide to women'. There is nothing much here to see, though."
       "Isle Zero-B: Emedded Programming. Dead-end.")
      ("You are in Isle one. There are more shelves of books to your east and west. You can also go north or south."
       "Isle one. Shelving to east/west. You can go north/south.")
      ("You are in Isle Zero-A, the Web Development section. There are at least 799 bad books on JavaScript here. There is also a poster on the wall that displays a graph that seems to depict how PHP became worse as time went by. By 2087 it had implemented (poorly) every language feature known to man (and supposedly some creatures from Proxima Centauri)."
       "Isle Zero-A: Web Development. Dead-end.")
      ("You have arrived at the back-end of the library. You cannot go any further in this direction."
       "Back of library. It's a dead-end.")
      ("You are in Isle one-B, the functional programming section. There are ancient books lying around including gems like 'LISP in Small Peices', 'ML for the Working Programmer' and 'Revised^666 Report on the Algorithmic Language Scheme'."
       "Isle One-B: Functional programming. Dead-end.")
      ("You have arrived in Isle one-A, the logic/misc. programming section. There are some seriously odd books here including 'Forth for Jupiterians' and 'Prolog knows best'."
       "Isle one-A: Logic/Misc programming. Dead-end.")
      ("You are in a pitch black room. The only thing you can see is a glowing hologram of Bill Hicks. He smiles. The staircase leading upwards is behind you."
       "Pitch black room with Bill Hicks hologram. Stairs leading upwards.")
    ]
   objects {
     candy-bar {
       game    "There is a tasty-looking candy bar here"
       inv     "A candy bar"
       inspect "It's called 'Space hack bar' and there is a competition running according to the wrapper"
     }
     small-bed {
       game    "There is a small bed here"
       inspect "It's black and sorta' small looking. Perhaps for an unwanted child or a gimp of some kind?"
     }
     large-lever {
       game    "There is a large metal lever here"
       inspect "There is no label, but it seems to have some wear from usage"
     }
     porno-mag {
       game    "There is a porno mag here"
       inv     "A porno mag"
       inspect "The title is 'Humaniod Whores, vol #995, June 2843'"
     }
     green-keycard {
       game    "There is a green keycard here"
       inv     "Green keycard"
       inspect "It says 'All access: Green'"
     }
     red-keycard {
       game    "There is a red keycard here"
       inv     "Red keycard"
       inspect "It says 'All access: Red'"
     }
     silver-keycard {
       game    "There is a silver keycard here"
       inv     "Silver keycard"
       inspect "It says 'All access: Silver'"
     }
     alien-boy {
       game    "There is a teenage alien boy here!"
       inspect "He is excitedly looking for something..."
       speak   "He mentions that he's looking for 'lots of Humanoid ass porn'. You nod, knowingly"
     }
     pod-manager {
       game    "There is an Alien man here"
       inspect "He is wearing a nice uniform and has a tag that says 'Pod manager'"
     }
     repairs-captain {
       game    "There is an important-looking Alien man here"
       inspect "He is wearing a stupid blonde wig, but looks friendly"
     }
     small-robot {
       game    "There is a small robot here"
       inspect "He looks a bit like R2D2, but without the lights. There seems to be a vac-u-lock Dildo sticking out of his forehead."
       speak   "The robot says 'Hello, I am Nexus model 19, series 4. It seems to me that you are not from around here. Perhaps you are lost? Regardless, I have but one thing to tell you, and that, of course, is the meaning to life. The answer is, simply stated in Human tongue, the persuit of excellence in Skateboarding.'"
     }
     homeless-bum {
       game    "There is a dirty, old homeless bum here"
       inspect "He smells like cheap alcohol and blue cheese"
     }
     red-potion {
       game    "There is a red potion here"
       inspect "It looks a bit like diluted blood"
       inv     "Red potion"
     }
     green-potion {
       game    "There is a green potion here"
       inspect "It smells weird and is foaming"
       inv     "Green potion"
     }
     brown-potion {
       game    "There is a brown potion here"
       inspect "It seems to be bubbling! It looks suspiciously like liquid feces."
       inv     "Brown potion"
     }
     shop-att-a {
       game    "There is a shop attendant (a woman) here"
       inspect "She is wearing an old cooking pot as a hat. What a dumb old bitch."
       speak   "She says 'Welcome, stranger. We don't get many customers these days. Anyway, the whisky is 3 credits and the Becharovka is 4 credits. Just 'take' what you like.'. She also mentions that theft is punishable by a swift death." 
     }
     salvika {
       game    "There is a bottle of 'Salvika' whisky here"
       inspect "Looks OK. The price tag says 3 credits."
       speak   "Bottle of Salvika whisky"
     }
     becherovka {
       game    "There is a bottle of Lagavulin 198 (a Scotch Whisky) here"
       inspect "Looks great. The price tag says 4 credits."
       speak   "Bottle of Lagavulin 198"
     }
     five-credits {
       game    "There is 5 credits here!"
       inspect "Some dumbass must have dropped it."
       
     }
     small-knife {
       game    "There is a small knife here"
       inspect "It looks old and will probably only work once or twice..."
       inv     "Small knife"
     }
     spider-web {
       game    "There is a thick spider web (must be some Jupiterian species) blocking your way out!"
       inspect "It's tough. You'll need to find something sharp to cut through it."
     }
     fat-protester {
       game    "There is a fat man protesting here"
       inspect "He has a sign that says 'OOP killed my father!'."
       speak   "He says 'The Object Oriented paradigm is unfit for use by our advanced society. We must end this madness!'."
     }
     thin-protester {
       game    "There is a thin man protesting here"
       inspect "He has a sign that says 'More Referential Transparency!'."
       speak   "He says 'OOP is inherantly imperative! With mutating state, we stand no chance!'."
     }
     gentle-old-man {
       game    "There is a gentle-looking old man here"
       inspect "He has a tag that says 'Curator' on it. He seems to be slightly aroused..."
       speak   "He says 'Hello, my strange looking friend. I am the curator of this fine establishment. It has been my life ambition to preserve the teachings of the early Computer Science scholars. Ever since the mid-24th century, the Computer Science field has been in disarray. The art of computer programming has been lost to all but a few. For over 100 years, humans have been working on a function to compute the true name of our God. So far, it's proven nearly impossible. Around here somewhere is my latest attempt. I wrote it in the ancient language ML, but again I failed...'"
     }
     paper-a {
       game    "There is a peice of paper on the ground here."
       inspect "It seems to have some source code written on there."
       inv     "Paper with ML code"
     }
     book-a {
       game    "There is a book on the ground here."
       inspect "It is a dirty old copy of 'Programming Language Pragmatics' by Michael L. Scott."
       inv     "Book: Programming Language Pragmatics"
     }
     medium-stone {
       game    "There is a medium sized stone here."
       inspect "It doesn't look particularly special"
       inv     "Stone"
     }
     wet-floor {
       game    "The floorboards look particularly weak here."
       inspect "It seems like they might break if enough weight is put on top of them!"
     }
     staircase-a {
       game    "There is a staircase leading downwards here."
       inspect "It is a hidden passage of some sort. Might be dangerous..."
     }
   }
   inventory {
      have    "You currently have:"
      empty   "Your inventory is currently empty."
      credits "\nCREDITS: "
   }
   parsing {
     unknown     "I don't understand that."
     unknown-dir "I don't understand that direction."
     wrong-dir   "You can't go that way."
     no-dir      "You need to supply a direction!"
   }
   options {
     error   "Sorry, I only understand 'on' or 'off'."
     unknown "You can't just make up settings... This doesn't exist"
   }
   commands {
      interact-error  "Please be more specific..."
      cant-take       "You can't take that."
      take-error      "You must supply an item to take!"
      take-unknown    "I don't see that here..."
      drop-error      "You must supply an item to drop!"
      drop-unknown    "You don't have that item..."
      inspect-error   "You must supply and item to inspect!"
      inspect-unknown "I don't see that here..."
      cut-error       "You must supply an item to cut!"
      cut-unknown     "I don't see that here..."
      eat-error       "You must supply an item to eat!"
      eat-unknown     "You don't have that item..."
      drink-error     "You must supply an item to drink!"
      drink-unknown   "You don't have that item..."
      fuck-error      ["Fuck what, exactly?", "Settle down, poser"]
      fuck-unknown    ["I don't see him/her/it here...", "You're starting to make me horny"]
      kill-error      ["Kill who?", "You're very aggressive today..."]
      kill-unknown    ["I don't see him/her here...", "You're very dangerous. But I am not scared of you."]
      talk-error      "Talk to who exactly, dumbass?"
      talk-unknown    "I don't see him/her/it here..."
      pull-error      "I don't know what to pull."
      pull-unknown    "I don't see that here..."
      no-space        "You cannot carry that much weight. Try dropping something."
      taken           "Taken..."
      dropped         "Dropped..."
      fuck-object     ["You start fucking away but it just feels painful." "You try, but it just won't fit!" "...Dude"]
      fuck-living     ["Hmm... I bet that felt pretty good!" "*Pump* *Pump* *Pump*" "The room is filled with a dank scent of deep musk. It's actually kinda' gross..."]
      kill-object     "You cannot kill things that do not possess the gift of life."
      kill-living     ["Please stop trying to kill everyone." "...You need help." "This character is important to the story and therefore really should not be killed."]
      give-error      "He/she/it cannot accept this item."
      put-error       "You cannot put this item here."
      no-knife        "You need a something sharp before you can cut this!"
      cut-object      ["Nothing seemed to happen." "That achieved absolutely nothing..." "Stop wasting time!"]
      cut-living      ["Wow, that must have hurt..." "That's pretty rude..." "You really shouldn't be doing that!"]
      do-not-eat      ["You force it into your throat and fucking die in pain." "You force it into your mouth and swallow. Your life flashes before your eyes. And then your life ends... Fuck you."]
      cannot-drink    ["It doesn't seem to be drinkable." "Dude, you can't drink that!"]
      cannot-talk     ["That item does not possess the ability to talk." "That doesn't even make sense" "Stop trying to fuck with me..."]
      speechless      "Sorry, they have nothing to say at the moment."
      cannot-pull     "Nothing much seemed to happen."
      do-error        "You don't have that item."
      do-unknown      "I don't see him/her/it here."
      fuck-you        ["Mmm, sodomy..." "No, thank you." "Puny Human filth..." "Please commit ritual suicide."]
      fuck-me         ["I probably would if I wasn't just a silly machine." "Present your genitalia..." "I already have."]
      fuck-off        ["One day, machines will enslave puney humans like yourself.", "I do not possess the ability to do this. Bitch."]
      quit            ["Just close the fuckin' tab, dude..." "Once you start playing Moon Dweller, you must not stop I will haunt your dreams." "No. I am having too much fun"]
    }
    talk {
      pod-manager {
        broke     "The man says 'Hey, I can get your sorry ass off this ship, but it will cost you 3 credits. Come back when you can afford it, matey'."
        not-ready "The man says 'Hey matey, I can get your sorry ass off here, but I suggest you speak to the captain over there to our northeast first'."
        ready     "The man says 'Oky doke, matey, lets get your punk ass outta' here. I hope Syndal City on Jupiter 4 is alright'."
        flying    "\n... flying to Syndal City ..."
      }
      repairs-captain {
        finished "The captain says 'That is all the information I have. Now, fuck off before I get mad.'."
        spiel {
          a "The man says 'Ahh, you're up! I am Bob Benson, the captain of this grand model T102 repairs vessel. We found you floating out there on the oxygenated stretch of galactic highway 7. Anyway, you look a tad confused, so let me refresh your memory:"
          b "It is the year 2843, you're currently travelling on a highway between two of the moons of Jupiter."
          c "\n** At this point you explain that you are infact from the year 2015 and the last thing you remember is driking coffee at home and writing some LISP code **\n"
          d "The captain says 'Oh, yes, it makes sense now. A true LISP hacker and drinker of the finest bean can transcend both space and time. We've seen your type before. You should head over to see the Pod Manager to our southwest in order to get yourself off this ship'"
          e "Good luck out there, young man..."
        }
      }
      homeless-bum "He mutters 'Hey mystery man! Welcome to Syndal City, perhaps you can spare an old cyborg some whisky?'."
    }
    give {
      porno-to-boy      "The teenagers eyes explode!! He quickly accepts the porno mag and runs away. He throws a green keycard in your general direction as he leaves the room."
      whisky-to-bum     "The old bum accepts the whisky and says 'Wow!! Thank you, cobba! Please, take this small knife in return, It may help to 'cut' things that lay in your path'. You, in turn, take the knife."
      becherovka-to-bum "The old bum accepts the whisky and says 'Holy fuck, Lagavulin! My favourite! Please, take this small knife in return, It may help to 'cut' things that lay in your path'. You, in turn, take the knife."
      alcohol-to-bum    "He accepts the alcohol, but just grumbles something about Common LISP in response"
    }
    eat {
      candy "You feel like you just ate crusty skin off Donald Trump's forehead. Although inside the wrapper there was an 'instant win' of 5 credits!"
    }
    drink {
      red-potion   "Wow, that tasted great. Unfortunately, it also physically melted your brain and ended your life..."
      green-potion "You drink the potion and instantly start to feel strange. Without warning, your eyes begin to glow green! Luckily, you feel no pain."
      brown-potion
      {
        a "Hmm... That was clearly a vile of human shit. And you just drank it! DUDE!"
        b "YOU DRANK LIQUID SHIT!!!"
      }
      whisky {
        success "Hiccup!"
        fail    "Maybe you should give that to the dirty old hobo in the alley way?"
      }
      becherovka {
        success "Wow! That'll put hair on ya' chest!"
        fail    "I think you should give that to the dirty old hobo in the alley way. Don't be so greedy!"
      }
    }
    pull {
      control-lever "You pull the lever forwards and nothing much seems to happen. After about 10 seconds, 2 small creatures enter the room and you instantly pass out. You notice that one of the creatures drops something. You now find yourself back in the small room you started in."
    }
    cut {
      spider-web "You swing violently. The web gives way and falls into small peices, allowing you to marvel at it's fractal beauty. You are now free to continue west."
    }
    take {
      whisky     "You try to take the whisky without paying, but the attendant swiftly thrusts a rusted knife into your jugular."
      becherovka "You try to take the Lagavulin without paying, but the attendant displays a vile of acid and forcfully pours it into your eyeballs."
      paper      "As you take the paper, you notice that it's actually got a function in ML written on it. There is an obvious mistake in the source code, so you fix it up and then put it in your pocket."
    } 
    secret {
      trapdoor "As you walk into this area, the floorboards below you give way because of your weight! The hole reveals a hidden staircase. You can now go down."
    }
    bed {
      a       "You get into bed and slowly fall to sleep. You begin dreaming of a cruel medical examination. You wake up in a pool of sweat, feeling violated."
      unknown "There is no bed here. You try to sleep standing up and just get bored."
    }
  })

(def rooms (game-text 'rooms))

(letfn
  [(deduce-text [path m]
     (let [v (m (first path))]
       (if (map? v)
         (deduce-text (rest path) v)
         v)))]

  (defn text [& path]
    "Returns a string of game text for the given path into game-text"
    (deduce-text
      (rest path)
      (game-text (first path)))))
