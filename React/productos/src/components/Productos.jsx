
import Producto from './Producto'


export default function Productos({producto, agregarFavoritos, eliminarFavoritos}) {

  return (
    <div className='productos'>
      {
      productos.length > 0 ?  productos.map(producto => <Producto key={producto.id} producto={producto} agregarFavoritos={agregarFavoritos} eliminarFavoritos={eliminarFavoritos}/>)
      :
      <p>No hay productos en Favoritos</p>
}
    </div>
      

  )
}
