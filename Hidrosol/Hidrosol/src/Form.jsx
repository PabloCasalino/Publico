import React from 'react'

export default function Form() {
  return (
    <div>
        <form className="formulario">
      <label>Nombre</label>
      <input className="nombre" type="text" />
      <label>Apellido</label>
      <input className="apellido" type="text" />
      <label>Teléfono</label>
      <input className="telefono" type="number" />
      <label>Barrio</label>
      <input className="barrio" type="text" />
      <label>Fecha</label>
      <input className="fecha" type="date" />
      <label>Vendedor</label>
      <input className="vendedor" type="vendedor" />
      <label>E-mail</label>
      <input className="email" type="email" />
      <button className="button" type="submit">Proceder</button>
    </form>
      
    </div>
  )
}
