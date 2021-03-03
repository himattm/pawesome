/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object AdoptionCenter {
    val dogs: List<Dog> = listOf(
        Dog(
            name = "Dandelion",
            breed = "Mixed",
            sex = DogSex.Female,
            age = DogAge.Adult, // 4
            weight = 44,
            color = "white/brown",
            images = listOf(
                R.drawable.dandelion,
                R.drawable.dandelion2,
            ),
            description = "Meet Dandelion!\nDandelion weighs approximately 45lbs right now, but she needs to gain a few pounds to reach a healthier weight.\nDandelion has met other dogs while at BARCS but wasn't interested in interacting, and the staff trainers think she would be happiest as the only dog to live in her forever home.\nIf you are interested in meeting me, please fill out an adoption application found on our website at barcs.org and email our foster department at dogfosters@barcs.org!",
            location = "Baltimore, MD"
        ),
        Dog(
            name = "Dolly",
            breed = "Chocolate Lab",
            age = DogAge.Unknown,
            weight = 0,
            color = "brown",
            location = "Ellicot City, MD",
            sex = DogSex.Female,
            description = "Dolly is looking for a great home!",
            images = listOf(
                R.drawable.dolly,
                R.drawable.dolly2,
                R.drawable.dolly3,
            )
        ),
        Dog(
            name = "Toby",
            breed = "Australian Cattle/Heeler",
            age = DogAge.Young, // 1
            weight = 40,
            color = "merle (blue)",
            location = "Baltimore, MD",
            sex = DogSex.Male,
            description = "\"I’m smart (if I do say so myself) and food-motivated. I enjoy games, like fetch. I like to chew and will happily entertain myself by gnawing on an elk antler or trying to pull apart my toys. When I have a task, I can be very focused and eager to please. I sit on command and come when called. I am quickly learning stay and down. I’m also working on walking on a leash, but I’m still young and can get excited and pull or jump.\nAs a pandemic pup, I have spent a lot of time at home and get nervous at new sights, loud noises or unknown people or dogs (although I’m good once I meet them). I need a patient owner who will continue my training and help me get more comfortable with my surroundings. Your efforts will be well rewarded because I am also extremely sweet and affectionate. When I crawl into your lap and rest my head on your shoulder, you’ll never want to let me go. At 40 pounds, I’m small enough to be a lap dog, right?\nEveryone says they have the cutest dog, but there’s a decent chance I actually hold that title. I’m looking for someone to love and trust, who has time for training, playing and cuddling.\"",
            images = listOf(
                R.drawable.toby,
                R.drawable.toby2,
                R.drawable.toby3,
            )
        ),
        Dog(
            name = "Titan",
            breed = "Doberman Pinscher",
            age = DogAge.Unknown,
            weight = 40,
            color = "Bicolor, Red / Chestnut / Orange",
            location = "Millersville, MD",
            sex = DogSex.Male,
            description = "I was abandoned by my former owner in boarding for several months. I am fairly new to rescue, and will be ready to find my forever home soon, but we know it may take some time to find me the perfect home. I am a great dog! I am big and strong and need to work on my leash manners a bit (a securely fenced yard is my favorite place to play) but I am smart and should learn quickly. I have tested well with big dogs. I don't like little dogs, or other small animals. I have not been around small children. If you would like to meet me, please submit an application on the website.",
            images = listOf(
                R.drawable.titan,
            ),
            url = "https://www.savinggraceanimalrescuemd.com/"
        ),
        Dog(
            name = "Winnie",
            breed = "Kelpie Mix",
            age = DogAge.Young, // 3
            weight = 47,
            color = "Black, Tricolor (Brown, Black, & White)",
            location = "Millersville, MD",
            sex = DogSex.Female,
            description = "Winnie came to us after her family was moving out of state, and could not take her with them. Winnie is a 47 lb, 3 year old kelpie mix? That’s what her paperwork says anyway. Winnie has enjoyed playing with her foster sibling (Summit the husky) but has not so much enjoyed the Queen B at her foster home. Winnie is also sad about losing her family, so it’s hard to determine if she is actually a mean girl and other girls can’t sit with her. Either way, Winnie will need a home without dogs, or only well behaved gentleman dogs. Her previous home has stated she has done well with children, and we have no history about cats. Winnie is a very energetic pup, and enjoys being with her people. She’s also a bit of a Velcro dog. If you would like to meet Winnie, drop us a line.",
            images = listOf(
                R.drawable.winnie,
                R.drawable.winnie2,
                R.drawable.winnie3,
            ),
            url = "https://www.savinggraceanimalrescuemd.com/"
        ),
        Dog(
            name = "Nala",
            breed = "Malamute/Husky/Grey Wolf mix",
            age = DogAge.Adult, // 6
            weight = 0,
            color = "Grey",
            location = " Millersville, MD",
            sex = DogSex.Female,
            description = "If you have additional questions please email info@huskyrescueteam.orgEveryone, meet Nala. Nala is a 6 year old Malamute/Husky/Grey Wolf mix who hasn't had the greatest start to life. Her previous owner treated her no different then a lighted reindeer decoration.... Yep, a lawn ornament! Nala was surrendered to a high intake shelter. She's confused and very unsure. She's also heartworm positive. Did you know owner surrenders are the first to be euthanized when the shelter is out of space? That was to be Nala's fate... Until a H-E-A-R-T volunteer intervened! Nala has quickly learned what it's like to be a cherished (indoor) family member and has been treated for heartworms. She's now seeking a forever home in a state/county that allows for wolfdog hybrids (she is 25%). Nala needs a home where there is another dog to play with, although she tends to be the boss so that dog should be on the submissive side. She also needs a secure, tall, fully fenced yard but will still require supervision when outdoors. Nala is house broken but has an occasional accident if you're not paying attention. We'd consider her high energy so a home with no small children who she could potentially knock over is preferred. Nala is crated when no one is home, but never for long periods of time. She needs a heavy duty crate because she can be quite the escape artist. She's a very tall girl as you might suspect but only weighs 60lbs. However, she is super strong on a leash. Applicants must have Husky experience at a minimum, Hybrid experience preferred. Nala is spayed and current on her vaccines. She is sweet, affectionate and has a larger than life personality. When she smiles her lip tucks like Elvis and it's the cutest darn thing! Nala can be transported for adoption. Her adoption area is NJ to GA but ONLY in states/counties that allow for wolf hybrids. Apply at www.huskyrescueteam.org~~Husky Education And Rescue Team is a foster based rescue. Our dogs are in our foster homes all up and down the east coast. We do not have a facility in which you can visit. We find this a huge benefit because we learn our dogs and are able to educate our adopters on what it's like to have them live in your home. Part of our process, once pre-approved, is to speak with the foster for the dog you're interested in. If you're still interested in adopting from our rescue the first step is to complete our adoption application online at www.huskyrescueteam.org/apply",
            images = listOf(
                R.drawable.nala,
                R.drawable.nala2,
                R.drawable.nala3,
            ),
        ),
        Dog(
            name = "Cardi",
            breed = "Husky/Pit Bull terrier mix",
            age = DogAge.Puppy, // 4.5 monmths
            weight = 5,
            color = "Yellow / Tan / Blond / Fawn",
            location = " Millersville, MD",
            sex = DogSex.Female,
            description = "Cardi is a high energy pup. She has shown to be reactive to other animals, and needs to be an only pet. Cardi (F) 4.5 month old Husky/Pit Bull terrier mix.",
            images = listOf(
                R.drawable.cardi,
                R.drawable.cardi2,
                R.drawable.cardi3,
            ),
        ),
        Dog(
            name = "Trooper",
            breed = "lab/husky mix",
            age = DogAge.Young,
            weight = 72,
            color = "White / Cream",
            location = "Greenbelt, MD",
            sex = DogSex.Male,
            description = "\"Meet Trooper! We believe this handsome boy is a lab/husky mix. Trooper is 2 years old and weighs about 72lbs. He has a beautiful sandy red coat and just a hint of blue in his right eye. Trooper does well walking on a leash, but make sure to leave some extra time as he loves to smell all the smells. We will update with more information as we get to know Trooper.\nPAW places animals in the Washington, DC Metropolitan area only.\"",
            images = listOf(
                R.drawable.trooper,
                R.drawable.trooper2,
                R.drawable.trooper3,
                R.drawable.trooper4,
                R.drawable.trooper5,
            ),
        ),
        Dog(
            name = "Caesar",
            breed = "Boxer",
            sex = DogSex.Male,
            age = DogAge.Adult, // 8
            weight = 69,
            images = listOf(
                R.drawable.caesar1,
                R.drawable.caesar2,
                R.drawable.caesar3,
            ),
            color = "brown/white",
            description =
            "Hey there! My name is Caesar and I'm 8 years young! I'm not quite in the heavy weight division but my 69 pounds packs a punch... and by \"\"punch\"\", I mean LOVE... question is, who wants to get knocked out!?I am a spunky guy who enjoys a nice stroll but my legs are not what they used to be in my young boxing days, so nothing too vigorous! But after that stroll, I will seek out endless pets and I will end up leaning into you just to make sure of it!I find myself curious of the other dogs around me but not too sure how to introduce myself, so I will need your help and patience to ensure I don't make a ruff first impression. So far, I have started meeting other dogs slowly and I seem to give off good vibes, so that's great news! I think I would like those young humans of yours too but I need a \"\"respect your elders\"\" kind of approach!\nSo now that you've read my stats, go ahead and email adoptions@sdsanctuary.com to schedule an appointment to meet me!",
            location = "Severn, MD",
        ),
        Dog(
            name = "Thanos",
            breed = "Great Dane",
            age = DogAge.Young, // 11 Months
            weight = 110,
            color = "black and white",
            location = "Silver Spring, MD",
            sex = DogSex.Male,
            description = "Meet Thanos! Thanos is a big, rambunctious boy with a lot of puppy energy and a heart as big as his body! Thanos is an absolute love with his people, but he can be wary of strangers so he needs a quiet home without a lot of people coming and going and a family who’s willing to help socialize him gradually so he learns that new humans = new friends! Thanos has not had much formal training and sadly, he's been bounced around a bit because of his size and energy, so Thanos is looking for a committed forever family who will help him learn his manners and can handle a bit of a bull in a china shop! Since Thanos is just a 110 pound puppy, he is looking for an adopter with large/XL dog experience who knows how to handle an overgrown pony who wants to sit in your lap and lean against your leg at all times. Thanos does well with other large dogs and would love a dog buddy to wrestle and play with! Though he is a sweet and affectionate guy, Thanos is probably best suited to an adults only home and is not well-suited to a family with young children. With some patient, consistent training, Thanos is sure to be the best ever companion for his new family! Apply today to meet Thanos!\"",
            images = listOf(
                R.drawable.thanos,
                R.drawable.thanos2,
            ),
        ),
        Dog(
            name = "Love Bug",
            breed = "Boerbel/Bulldog/Bullmastiff Mix",
            age = DogAge.Young, // 2
            weight = 95,
            color = "black",
            location = "Silver Spring, MD",
            sex = DogSex.Female,
            description = "\"Meet Love Bug! Love Bug is a very sweet and affectionate mastiff mix. To be precise, LB's DNA test revealed that she's 75% Boerboel, 12.5% standard Bulldog and 12.5% Bullmastiff!\nBug has a super cute tail nubbin and her whole body wiggles when she's happy, which is nearly all of the time! She’s looking for a family who would love to take her on a hike or out for a swim (there’s nothing cuter than a Love Bug splashing about, rolling in the sand and surf!) Love Bug adores other dogs, but isn't always great at taking their cues when they're done playing, so she would do best with another playful dog and a dog-savvy adopter who can help her learn how to play appropriately.\nThis darling girl is strong, and definitely needs some basic manners and leash training. She is also a typical mastiff and would do best with a very experienced adopter who's familiar with guardian breeds as she can be fear reactive to strangers (especially men) and exhibits some guarding behaviors. Bug is muzzle trained for everyone's safety and would love an adopter who will continue to work with her to teach her that strangers aren't as scary as she thinks, and who will manage introductions very safely. Bug is an eager student and excited to learn! If you give her your heart, she promises to be a loyal companion for years to come.\nBug needs a home with no young children, and she is not a good fit for a family with cats. Ask us about Love Bug today!\nLove Bug needs a foster or a loving forever home to lavish love and attention on her. Please open your heart and home to Love Bug!\nThe adoption fee for this dog is ${'$'}300, which includes the cost of heartworm treatment and routine vetting, including vaccinations and spay/neuter.\"",
            images = listOf(
                R.drawable.lovebug,
                R.drawable.lovebug2,
                R.drawable.lovebug4,
                R.drawable.lovebug5,
            ),
        ),
        Dog(
            name = "George",
            breed = "Beagle mix",
            age = DogAge.Adult, // 11 Months
            weight = 38,
            color = "brown/black/white",
            location = "Columbia, MD",
            sex = DogSex.Male,
            description = "\"This charming and engaging 8 year old, 38 lb beagle has been medically cleared and is ready for his forever home! George lost his sight, but you'd never know it! There are three things that make George ecstatically happy~ belly rubs, children, and toys. When you rub his side, he will flop over and expose his entire belly so you don't miss one single bit of it. When he hears the giggling of children, he will run to find that small person and woof for attention. When George comes across a toy, he will zoomy in a circle with his ear down to the ground so he doesn't lose track of where he is. He is extremely resourceful, and his other senses work very well.\nGeorge has been through a lot in his life, and we made a promise to him that we would find him the perfect family. That family will preferably have a one story house so he doesn't fall down stairs; a ton of patience to help guide him around in his new abode; a fenced in yard or other safe space to play with his ball; and an available hand for endless belly rubs; and dog savvy children. In his perfect home there are no other animals because he deserves to be the one and only and get all the attention.\nGeorge is house broken and crate trained and will come when he's called and knows 'sit.' He'd prefer to actually sit in your lap or lean into your legs, and we think that is pretty adorable. After all, a relaxed sit is still a sit in our book.\nAre you the happily ever after for George?\nGeorge is up-to-date, neutered, and blind. His adoption fee is ${'$'}300.\"",
            images = listOf(
                R.drawable.george,
                R.drawable.george2,
                R.drawable.george3,
            ),
        ),
        Dog(
            name = "Bianca",
            breed = "Pit bull Terrier Mix",
            sex = DogSex.Female,
            age = DogAge.Adult, // 5
            weight = 41,
            color = "white/cream",
            images = listOf(
                R.drawable.bianca,
                R.drawable.bianca2,
                R.drawable.bianca3,
                R.drawable.bianca4,
            ),
            description = "When we asked the shelter staff if there were any standouts, Blanca was immediately mentioned. She has the sweetest disposition and at 5 years old, she still has enough energy to keep up for a good walk or hike, but has long outgrown the puppy energy. Her foster reported that she crushed her first run so she could definitely help you stay accountable to your New Years resolutions!\nBlanca is the perfect partner for anyone looking for an affectionate and people-loving dog. Despite Blanca's white coat, her extroverted personality makes her a shadow behind each of her foster's steps. Blanca's calm and playful demeanor would make her a great addition to any family with children. She loves bouncing around for squeaky balls and resting her head gently on my legs.\nHer curiosity takes her many places and hopefully into a forever family with you! Currently, her curiosity has drawn her to running around in the grass, jumping onto the bed, and sniffing every inch of our walks. Blanca enjoys walks but also loves cuddling up on the couch with a fuzzy blanket.\nHer leash and sit skills are top-notch, but would benefit from someone who could practice more skills. Blanca would be excited to meet anyone who is willing to provide extra rubs on her.\nBlanca is a truly resilient dog and has healed and transformed into the most beautiful girl! She arrived at the shelter with severe Demodex mange (the good kind which isn't contagious to humans or other dogs) and has made a dramatic improvement! With her soft white coat nearly fully regrown, all that is left to clear up are her gorgeous eyes. Treatment is simple and includes oral medication as well as weekly medicated baths.",
            location = "Washington, DC",
        ),
    )
}

data class Dog(
    val name: String,
    val breed: String,
    val age: DogAge,
    val weight: Int,
    val color: String,
    val location: String,
    val sex: DogSex,
    val description: String,
    val images: List<Int>,
    val url: String? = null
)

enum class DogSex {
    Male,
    Female
}

enum class DogAge(val cutOff: Int) {
    Senior(Int.MAX_VALUE), // Dogs should live forever
    Adult(8),
    Young(4),
    Puppy(2),
    Unknown(-1),
}
