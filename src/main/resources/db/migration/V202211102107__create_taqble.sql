create table food_types (
    "id" SERIAL NOT NULL,
    "name" varchar(128) NOT NULL,
    "icon" varchar(128) NOT NULL,
    CONSTRAINT "food_types_pkey" PRIMARY KEY ("id")
);

CREATE TABLE places(
    "id" SERIAL not null,
    "name" varchar(128) not null,
    "address" varchar(128) NOT NULL,
    "image" varchar(128) NOT NULL,
    CONSTRAINT "places_pkey" primary key ("id")
);
create table foods(
    "id" SERIAL NOT NULL,
    "name" varchar(128) NOT NULL,
    "image" varchar(128) NOT NULL,
    "price" float not null,
    "place_id" int not null,
    "food_type_id" INT NOT NULL,
    CONSTRAINT "fk_food__food_types" FOREIGN KEY ("food_type_id")
    REFERENCES "food_types" ("id"),
    CONSTRAINT "foods_pkey" PRIMARY KEY ("id"),
    CONSTRAINT "fk_food_place" FOREIGN KEY ("place_id")
    REFERENCES "places" ("id")
);
insert into places ("name", "address", "image") values
    ('Moka Pot', '47 W 13th St, New York, NY 10011, USA', '../img/Moka_Pot.png'),
    ('Sunrise Roast', '20 Cooper Square, New York, NY 10003, USA', '../img/Sunrise_Roast.png'),
    ('Coffee Bloom', '1 E 2nd St, New York, NY 10003, USA', 'Coffee_Bloom.png'),
    ('The Caffeine Fix', '75 3rd Ave, New York, NY 10003, USA', '../img/The_Caffeine_Fix.png'),
    ('French Brew', 'Metrotech Center, Brooklyn, NY 11201, USA', '../img/French_Brew.png');
insert into food_types ("name", "icon") values
    ('Coffee', '../img/hot_beverage.png'),
    ('Steak', '../img/steaks.png'),
    ('Burger', '../img/burgers.png'),
    ('Bakery', '../img/bakery.png'),
    ('Dessert', '../img/dessert.png'),
    ('Sushi', '../img/sushi.png'),
    ('Sea food', '../img/sea_food.png'),
    ('Pasta', '../img/pasta.png'),
    ('Cocktail', '../img/cocktail.png'),
    ('Pizza', '../img/pizza.png'),
    ('Fast food', '../img/fast_food.png'),
    ('Salad', '../img/salad.png');
