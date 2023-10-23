import React from 'react'
import { Link } from 'react-router-dom'
import LogoImg from '../img/lobo.png'

export default function Header() {
  return (
    <header className="header">
    <Link className="icon" to={'/'}> <img src={LogoImg} alt='Un lobito'/> </Link>
    <nav>
      <Link to={"/"}>Productos</Link>
      <Link to={"/favoritos"}>Favoritos</Link>
    </nav>
    </header>
  )
}
