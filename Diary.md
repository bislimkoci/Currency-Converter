##Diary##

This is going to be a little diary of how the project goes. What changes has been made, what I have learned and so on. 
This is going to be personal, I don't really have the energy to be professional.

2024/08/04

I wanted to make an online java program and saw this idea online that a good beginner project is to make a currency converter, using java, java servlet, applet and ajax.
No idea what the last three things are but that should not be a problem. Java will be used, but I might also use HTML, CSS and JavaScript to make the website which I have little to no experience in. 
I don't really know how servlet goes in to this, but I will try to include it. I will use gradle, because I know from school I should be using it, I don't really know why. Well, wish me luck and let's try coding this thing.

2024/08/05

Okey, where to begin. Let's start with the server. I have made some research and I came to the conclusion that Apache TomCat was not something I wanted to use. 
Not because it's trash, it's kinda good, but I could not bother downloading it and tweeking, so I am using SpringBoot instead. I have worked on springBoot before, and I did not like it. 
So here we are. I made a totally new project so I could have SpringBoot fixed from the get go. But I did a little research on how the project should be built. 
I first of all need to understand springBoot and how this ties to HTML. Then I need to know how the f**k API is going to be used and how java classes are going to be used in this. 
This is fun... But all jokes aside, this is going to be a big project for my size. Not because it is a difficult project, but I don't know anything about SpringBoot, API, how 
we tie SpringBoot and HTML together and shit I don't know that I don't know yet. But this is where I'm at. I am going to see how SpringBoot works, I've already managed to get it started but that is it.

2024/08/06

I am done watching tutorials. I watched a 1,5 h tutorial but honestly I got bored. It was about springBoot, and it's great, but I need to code something or I am never coding at all.
I know a little more than I did yesterday about spring. I know a little about endpoints, dependency-injection, how gradle and spring works. Now I still don't know enough,
but it will come with time. But what I want to start doing is create a simple Currency endpoint. One for USD, SEK, EUR etc... 1,5 h later. Okey so I thought it would be better
to just start with HTML and understand how HTML and the Controller work together. And they do it by using ThymeLeaf. ChatGPT help me alot with this to make an example structure. 
So my plan now is, to not get 100% brainroot and think about other stuff, I am going to make a simple HTML and CSS homepage. Soooooo let's go. I just need to fkn delete everything.

2024/08/07

AAALLright. I have not spent any time with the server and api side of things, not a thing. But I did finish making a simple html and css page. 
I used a little bit of thymeleaf, I don't however know if it works... 100% it won't. But it's fine!! It was nice doing something else than just server side. 
I like doing both frontend and backend and receiving feedback when it works. CSS and HTML is nice but for future project, like in the next three or four, I might change to 
either adding JavaScript or switching to React. But I am not really ready for that. HTML and CSS, I hope, will get the job done, someone had to use it at some time and integrate it with spring. 
But yeah, next steps. My next step is to make a simple controller in spring and see that the connection between my frontend and backend works. And then the last step adding a 
API to get the realtime currency converting. This project won't be what I had imagine it to be, it will be worse. But it is okey, I will take baby steps. My css is not on top. 
The backend will probably suck ass. But I will learn, it is better than doing nothing. Alright, peace out.

2024/08/08

Great steps foward. I have made a controller, some help with GPT to be fair but I know atleast a bit more. 
I tried using a RestController instead of just Controller but that did not work really. I tried searching the difference but honestly 
I did not understand a shit. Anyway, back to the fun stuff. I have a controller but I know the controller should not do the work. It just takes the request from the user, 
and just sends it away to the service layer. So nooowwww this is the fun part!! I now need to see and research(blää) how I can use API to get information from the other machines to 
get my exchange-rate. Let's fucking... go. Yeah, about 6 hours later. I said I am going to be personal so here I am. This API stuff is shit. It is maybe easy ass fuck but 
I don't understand it. Had a minor problem in my personal life aswell, and shit I had to fix with college stuff as I am doing a exchange program in Canada in like 18 days. 
Why I am telling you is because I can't bother putting more time today to search and learn about it, and that is fine. Life isn't easy and shit happens, sometimes life gets 
too much so you got to just sleep it of. But I will fix this shit, I am soooo close to coming to a finish product. Won't be able to code tomorrow but I will see what happens.

2024/08/10

Okeeey. I started a bit with my project and I am starting to get the hang of it. I am using freecurrencyapi.com to get the currency I want. I have an apikey etc. 
So the api sends me a JSON with all of the necessary information. I did not even know what JSON really was, but it just stores and sends information in a nice way. I have 
maneged to recieve information from the api by using springBoot restTemplate. I now need to figure out how to convert the JSON file so I could get information more simple. 
Now it is just a String. There might be a JSON parser in springboot. I might have to create a java class for the different type of request I am making. The problem is also that 
the api by default only gives me the exchange rate from USD to whatever. So for now I can't switch the source currency. Okey I understand know how to change source currency, at the end of 
the URL I just concatenate "&base_curreny={Currency Label}". Okey okey okey okey, lets figure out how to convert a json to a java object I can use. I am going to write 
here as I am learing so I can remember for next time. I need the dependency Jackson that converts JSON to java class and vice versa. I FUCING DID IT. Okey this is how it goes. 
SpringBoot uses restTemplate to make an api request to the currencyServer, but we are just now getting the status of my account. Then we added jackson to our dependencies 
and we now need to create a ObjectMapper object and convert the json String to whatever. I did not want to create a separate class for the status so I used JsonNode instead 
and just took the information I wanted, which was the total amount of requests made from my account. And we got the information, sent it back to the controller. I made just 
a simple HTML page to show the amount and boom, api integrated. I now API a little more now. I have other things to do now, fixing shit with my college and playing original doom game. Peace out.

2024/08/10 

Yes it is the same day. But guess what, I fkn did it. It is finish!!!!!! When I figured out the api integration it was very simple to finish the rest. 
But damn, this was really fun actually, learing about how api works, json, spring boot and so on. Very interesting, and ofcourse, I have more to learn about these stuff. 
Now let's talk about my thoughts about the finished product, what I like and don't like etc.

What I like about it:

It was a fun beginner project that really taught me the basics of front end and backend communication. I really liked that I could use both HTML and Java on the same project. 
I am saying that because I use java often but beginning of the summer I started doing HTML and stuff but still missed the logical thinking of thing, so nice to get the best of both worlds.
I like the way I could choose currencies really simple with the select tags and the converted amount showed up okey. For the backend I tried doing it "the way you are supposed to". 
I know there are four layers in springBoot; presentation, business, persistence and Database. I did only presentation and business as I did not need to save or convert data to 
and from different classes. However the business might in my case be a combination of business and persistence, I think at least. But it was nice using it. I am glad that I know more
about springBoot and it's capabilities. The might have been different ways of doing things, maybe how I received and handled the JSON stuff. But it was a good beginner project that introduced
me to a lot of things, it only taught me that java with springboot and gradle has alot to offer with it.

What I could do better:

In the beginning I said that I might use Java(I did), Java servlet(believe I did not need sense I used SpringBoot), Applet(Which in my case might be ThymeLeaf instead) and AJAX.
Now the first three I more or less in different ways did use, in different ways, to see the effect of it. However I did not implement AJAX, which would have been nice to have. 
When I entered the amounts etc, when I pressed enter, the page would reload and just add the converted value at the result div. The better would to not have it reload and just display the answer.
I belive this is where JavaScript and React would come into play in my case. So that is my most major improvement I could have done to make the program better. 
For the backend I feel like I could have made it better handling errors, because now I have zero. So if something goes wrong, the program would crash. That would be the best improvement.
I did also not use any tests for the program, I know you can do it very good with springBoot but I just wanted to get the project done. Those are the biggest things I would've been happy know before starting.
But you got to start somewhere.

Final thoughts:
I am really proud of myself for doing this project. I have always wanted to make an application that would have an API and cool webpage that people could visit etc. 
But I have always waited for the dumb reason that I might learn this stuff in college so why "waste time" trying to learn stuff the hard way when college would give me a lecture about it. 
And sure, I have used springBoot before in college and it did help have some kind of experience in it, but the experience was barely helpful for me, I had to relearn everything about it. 
And I know more now of how it actually works. For future project I would like to learn more about how to use endpoints better, how to structure a springBoot project much better to be more safe 
and easy to understand, how to integrate a database and api, how to make my project AJAX with JavaScript or whatnot and finally being better at designing webpages. Good beginner project and just do it. 
Don't wase to much time on tutorials, sure you still need to watch some to fkn understand, but the most knowledge I received was from coding, not knowing how to solve a problem, trying on my own, then researching on 
GOOGLE, then if I still don't get it watch tutorials and then GPT. Don't wait and give yourself excuses and just do it, I had a blast and will have a blast in other project. See you guys on the next one.

By: Biko, aka Bislim Koci
