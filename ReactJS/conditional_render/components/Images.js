import React, { useState } from "react";
import axios from "axios";
import Image from "./Image";

const Images = () => {
  const [images, setImages] = useState([]);

  function onClickHandler() {
    axios
      .get("https://jsonplaceholder.typicode.com/photos")
      .then((response) => {
        setImages(response.data);
      })
      .catch((error) => console.error(error));
      document.getElementById("showImages").style.display = "none";
      document.getElementById("hideImages").style.display = "block";
  }

  function hide() {
      setImages([]);
      document.getElementById("hideImages").style.display = "none";
      document.getElementById("showImages").style.display = "block";

  }
  return (
    <div>
      <h1>Images:</h1>
      <div className = "container">
          
      <button id = "showImages" className = "btn btn-primary" onClick={onClickHandler}>Get Images</button>
      <button id = "hideImages" className = "btn btn-danger" onClick={hide} style = {{display:"none"}}>Hide Images</button>
        <div className="row">
            {images.map((image) => (
            <Image data={image} />
            ))}
        </div>
      </div>
      
    </div>
  );
};

export default Images;
