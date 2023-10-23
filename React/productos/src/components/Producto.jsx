import React, { useState } from "react";
import { Link } from "react-router-dom";
import FavImg from '../img/blanco.svg'
import NoFavImg from '../img/negro.svg'

export default function Producto({producto, agregarFavoritos, eliminarFavoritos}) {

const[favorito, setFavorito] = useState(false);

function handleClick(){
if(favorito){
eliminarFavoritos(producto)
setFavorito(false)
}else{
  agregarFavoritos(producto)
  setFavorito(true)
}


}


  return (
    <div className="producto">
      <Link to={"/"}><img src={producto.image} alt="" /></Link>
      <div className="info">
        <p>{producto.title}</p>
        <mark>${producto.price}</mark>
        </div>
        
      {
          favorito ?
           <img className="icon" onClick={handleClick} src={NoFavImg} alt=""/> 
          :
           <img className="icon" onClick={handleClick} src={FavImg} alt=""/> 
        
      }
     

    </div>
  )
}
