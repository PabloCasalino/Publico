import React, { useEffect, useState } from 'react'
import { obtenerProductos } from '../servicios/productoservice'

export default function Productos() {
  const [productos, setProductos] = useState([])

  useEffect(()=> {
obtenerProductos().then(data =>
   {setProductos(data)
  } )
  },[])
  return (
    <div>{
      productos.map(producto => <p>{producto.title}</p>)
    }
    </div>
  )
}
