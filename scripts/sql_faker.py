import os
import random
import shutil

from faker import Faker

FAKE = Faker()

NUM_RECORDS = 66

PRODUCTS_BY_CATEGORY = {
    "cpu": [
        "Intel Core i9",
        "AMD Ryzen 9",
        "Intel Core i7",
        "AMD Ryzen 7",
        "Intel Core i5",
        "AMD Ryzen 5",
    ],
    "gpu": [
        "NVIDIA GeForce RTX 3080",
        "AMD Radeon RX 6800 XT",
        "NVIDIA GeForce RTX 3070",
        "AMD Radeon RX 6700 XT",
        "NVIDIA GeForce GTX 1660",
        "AMD Radeon RX 5600 XT",
    ],
    "ram": [
        "Corsair Vengeance LPX",
        "G.Skill Ripjaws V",
        "Kingston HyperX Fury",
        "Crucial Ballistix",
        "ADATA XPG Spectrix",
        "Team T-Force Delta RGB",
    ],
    "motherboard": [
        "ASUS ROG Strix",
        "MSI MPG Gaming",
        "GIGABYTE Aorus",
        "ASRock Steel Legend",
        "ASUS TUF Gaming",
        "MSI PRO",
    ],
    "hdd": [
        "Seagate Barracuda",
        "Western Digital Blue",
        "Toshiba P300",
        "HGST Deskstar",
        "WD Black",
        "Seagate IronWolf",
    ],
    "ssd": [
        "Samsung 970 EVO",
        "WD Blue SN550",
        "Crucial MX500",
        "Kingston A2000",
        "ADATA XPG SX8200 Pro",
        "Sabrent Rocket NVMe",
],}

DISTRIBUTORS = [
    "Amazon",
    "Newegg",
    "Micro Center",
    "Mercado Libre",
    "Alkosto",
    "Falabella",
    "Exito",
    "Ktronix",
    "PcComponentes",
]

IINSERT_ROWS = []

for _ in range(NUM_RECORDS):
    CATEGORY = FAKE.random_element(PRODUCTS_BY_CATEGORY.keys())
    NAME = FAKE.random_element(PRODUCTS_BY_CATEGORY[CATEGORY])
    PRICE = round(random.uniform(50, 1000), 2)
    DISTRIBUTOR = FAKE.random_element(DISTRIBUTORS)
    IINSERT_ROWS.append(f"(NULL, '{NAME}', '{PRICE}', '{DISTRIBUTOR}', '{CATEGORY}')")

INSERT_QUERY = (
    "INSERT INTO `products` (`id`, `name`, `price`, `distributor`, `category`) "
    f"VALUES {', '.join(IINSERT_ROWS)};\n"
)


with open("faker_data.sql", "w") as file:
    file.write(INSERT_QUERY)


shutil.move(f"{os.path}/../faker_data.sql", f"{os.path}/../db/faker_data.sql")