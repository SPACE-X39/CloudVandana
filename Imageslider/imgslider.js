
const images = [
    "https://m.media-amazon.com/images/I/71Xg-xZlFDL._AC_UF1000,1000_QL80_.jpg",
    "https://ichef.bbci.co.uk/images/ic/1200x675/p09t1hg0.jpg",
    "https://cdn.pixabay.com/photo/2020/10/28/10/02/captain-america-5692937_640.jpg",
    "https://cdn.magicdecor.in/com/2023/10/26161113/Fury-of-the-Hulk-Wallpaper.jpg",
    "https://wallpapers.com/images/hd/mystic-arts-master-doctor-strange-4k-7a4gwgasuj35gdmk.jpg"
];

let currentIndex = 0;
const sliderImage = document.getElementById("slider-image");

function updateImage() {
    sliderImage.style.opacity = 0;
    setTimeout(() => {
        sliderImage.src = images[currentIndex];
        sliderImage.style.opacity = 1;
    }, 300);
}

window.onload = () => {
    sliderImage.src = images[currentIndex];
};

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
}

